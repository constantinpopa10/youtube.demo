package misc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class WhiteSpaceChars {
  public static void main(String args[]) throws Exception {
    FileReader fr = new FileReader(args[0]);
    BufferedReader br = new BufferedReader(fr);
    StreamTokenizer st = new StreamTokenizer(br);
    st.whitespaceChars(' ', ' ');
    while (st.nextToken() != StreamTokenizer.TT_EOF) {
      switch (st.ttype) {
      case StreamTokenizer.TT_WORD:
        System.out.println(st.lineno() + ") " + st.sval);
        break;
      case StreamTokenizer.TT_NUMBER:
        System.out.println(st.lineno() + ") " + st.nval);
        break;
      default:
        System.out.println(st.lineno() + ") " + (char) st.ttype);
      }
    }
    fr.close();
  }
}