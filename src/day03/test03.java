package day03;

import java.text.DecimalFormat;

public class test03 {
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("0.00");
		df.format(7.0/9);
		System.out.println(df.format(7.0/9));
	}
}
