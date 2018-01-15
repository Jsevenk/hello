package day03;

import java.math.BigInteger;

public class test04 {
	public static void main(String[] args) {
		 BigInteger a = new BigInteger("11111111111111111111111111");
		 BigInteger c = new BigInteger("1");
		 
	        int b = a.intValue();//转换成int类型
	        System.out.println(b);
	        int d=c.intValue()+1;
	        System.out.println(d);
	        
	}
}
