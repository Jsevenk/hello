package demo01;

import java.math.BigInteger;

public class BigInterger2 {
	public static void main(String[] args) {
		 BigInteger a = new BigInteger("11111111111111111111111111");
		 BigInteger c = new BigInteger("1");
		 
	        int b = a.intValue();//ת����int����
	        System.out.println(b);
	        int d=c.intValue()+1;
	        System.out.println(d);
	        
	}
}
