package day01;

public class test04 {

	public static void main(String[] args) {
		   String[] aa = "aaa|bbb|ccc".split("|");

//		    String[] aa = "aaa|bbb|ccc".split("\\|"); //�������ܵõ���ȷ�Ľ��

		    for (int i = 0 ; i <aa.length ; i++ ) {

		      System.out.println("--"+aa[i]); 

		    } 

	}

}
