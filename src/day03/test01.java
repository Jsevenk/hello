package day03;

public class test01 {
	public static void main(String[] args) {
		String a="";
		if(a==""){
			a="0";
		}
		int num=Integer.parseInt(a);
		System.out.println("==============");
		System.out.println(num);
		String aaa="012345";
		String b=aaa.substring(0, 2);
		System.out.println(b);
	}
}
