package day03;
/**
 * substring截取
 * @author Administrator
 *
 */
public class test06 {

	public static void main(String[] args) {
		//截取身份证(18)的后六位
		String str="123456789012345678";
		System.out.println(str.length());
		str.substring(12);
		System.out.println(str.substring(12));
	}

}
