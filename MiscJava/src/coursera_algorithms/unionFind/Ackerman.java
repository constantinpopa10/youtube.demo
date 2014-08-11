package coursera_algorithms.unionFind;

import java.math.BigInteger;

public class Ackerman {
	public static BigInteger ack(BigInteger m, BigInteger n) {
	    return m.equals(BigInteger.ZERO)
	            ? n.add(BigInteger.ONE)
	            : ack(m.subtract(BigInteger.ONE),
	                        n.equals(BigInteger.ZERO) ? BigInteger.ONE : ack(m, n.subtract(BigInteger.ONE)));
	}
	
	public static void main(String[] args) {
		BigInteger m = new BigInteger("2");
		BigInteger n = new BigInteger("3100");
		try{
			System.out.println("Ackerman of: m = " +m + " n=" + n + " => " + ack(m,n));
		}catch(java.lang.StackOverflowError err){
			System.out.println(err);
			main(null);
		}
		
	}
}
