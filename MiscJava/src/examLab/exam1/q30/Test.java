package examLab.exam1.q30;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
//		for (int i = 0; i < 4; System.out.println(i)) {
//			i++;
//			whileLoop : while(true){
//				i++;
//				if(i<2)continue;
//				else break whileLoop;
//			}
//			i++;
//			if(i>2)continue;
//			else break;
//		}
//		List<Integer> mb = new ArrayList<Integer>();
		//System.out.println(~2);
		StringBuffer sb = new StringBuffer("Sun");
		sb.insert(1, "ExamLab").append("SCJP").delete(1, 3).reverse();
		System.out.println(sb);
	}
}
