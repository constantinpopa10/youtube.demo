package scjp.studyGuide;

import java.util.HashMap;
import java.util.Map;

public class Mangler {
	public static <K,V> Map<V,K> mangle(Map<K,V> in){
		Map<V,K> out = new HashMap<V,K>();
		for(Map.Entry<K, V> entry : in.entrySet()){
			out.put(entry.getValue(), entry.getKey());					
		}
		return out;
	}
	
	public static void main(String[] args) {
		Map<String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("a", 1);
		m1.put("b", 2);
		Map<Integer, String> m2 = mangle(m1);
		System.out.println(m2.get("a") + " " + m2.get(2));
	}
}
