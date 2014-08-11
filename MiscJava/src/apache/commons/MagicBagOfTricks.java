package apache.commons;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections4.Bag;
import org.apache.commons.collections4.ComparatorUtils;
import org.apache.commons.collections4.FunctorException;
import org.apache.commons.collections4.Transformer;
import org.apache.commons.collections4.bag.HashBag;
import org.apache.commons.collections4.bag.TransformedBag;
import org.apache.commons.collections4.comparators.NullComparator;
import org.apache.commons.collections4.keyvalue.MultiKey;
import org.apache.commons.lang3.StringUtils;

import apache.commons.SimpleClosure.Gender;


public class MagicBagOfTricks
{
  @SuppressWarnings({ "rawtypes", "unchecked" })
public static void main(String[] args) throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException
  {
    List<LaborForce> list = new ArrayList<LaborForce>();
    File myFile=new File("data.txt");
    URL url = myFile.toURI().toURL();
    //URL url = new URL("file", "D:/Dropbox/JavaWorkspace/MiscJava", 80, "/data.txt");
    BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
    String str;
    if (((str = in.readLine()) != null))
    {
      do
      {
        String[] strings = str.split("\t");
        strings = StringUtils.stripAll(strings);
        State state = null;
        Gender gender = null;
        Integer year = null;

       try{
    	   state = State.valueOf(StringUtils.trim(strings[0]));
    	   gender = "Male".equals(StringUtils.trim(strings[1])) ? Gender.Male : Gender.Female;
           year = Integer.valueOf(StringUtils.trim(strings[2]));
       }
        catch(Exception ex){ 
        	ex.printStackTrace();
        }

       if(state!=null && gender!=null && year!=null){
    	   list.add(new LaborForce(state, gender, year)); 
       }        
      } while ((str = in.readLine()) != null);
    }
    in.close();

    Map map = PropertyUtils.describe(new LaborForce());
    Set s = map.keySet();
    s.remove("class");
    System.out.println("All the possible properties on the LaborForce bean are [" + StringUtils.join(s.toArray(),",") + "]");

    Bag masterBag = new HashBag();
    Bag genderBag = TransformedBag.transformedBag(masterBag, new PropertiesMultiKeyTransformer( new String[]{ "gender" } ) );
    Bag genderYearBag = TransformedBag.transformedBag(masterBag, new PropertiesMultiKeyTransformer( new String[]{ "gender", "year" } ) );
    Bag genderYearStateBag = TransformedBag.transformedBag(masterBag, new PropertiesMultiKeyTransformer( new String[]{ "gender", "year" , "state" } ) );

    genderBag.addAll( list );
    genderYearBag.addAll( list );
    genderYearStateBag.addAll( list );

    Comparator comparator = ComparatorUtils.chainedComparator(new Comparator[]{new MultiKeyCompartor(0),new MultiKeyCompartor(1),new MultiKeyCompartor(2)});
    Set<MultiKey> set = new TreeSet<MultiKey>(comparator);
    set.addAll(masterBag.uniqueSet());
    for (MultiKey multiKey : set)
    {
      System.out.println( "[" +StringUtils.join(multiKey.getKeys(),',') + "] = " + masterBag.getCount(multiKey));
    }
  }
  private static class PropertiesMultiKeyTransformer implements Transformer<Object, Object>
  {
    String[] methodNames;
    private PropertiesMultiKeyTransformer(String[] methodNames)
    {
      this.methodNames = methodNames;
    }
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Object transform(Object o)
    {
      List<Object> ooos = new ArrayList<Object>();
      for (String methodName : methodNames)
      {
        try
        {
          ooos.add(PropertyUtils.getProperty(o, methodName));
        }
        catch (Exception e)
        {
          throw new FunctorException(e);
        }
      }
      return new MultiKey(ooos.toArray(new Object[ooos.size()]));
    }
  }
  @SuppressWarnings("rawtypes")
private static class MultiKeyCompartor implements Comparator<MultiKey>
  {
    private int i;
    private MultiKeyCompartor(int i)
    {
      this.i = i;
    }
    @SuppressWarnings("unchecked")
	public int compare(MultiKey o1, MultiKey o2)
    {
      Object[] keys1 = o1.getKeys();
      Object[] keys2 = o2.getKeys();
      Object oo1 = null;
      try
      {
        oo1 = keys1[i];
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
      }
      Object oo2 = null;
      try
      {
        oo2 = keys2[i];
      }
      catch (ArrayIndexOutOfBoundsException e)
      {
      }
      NullComparator nullComparator = new NullComparator(false);
      return nullComparator.compare(oo1, oo2);
    }
  }
}
