package day04;

public class test08 {

	public static void main(String[] args) {
		String str="111";
		String str1="111,222";
		String[] arr=str.split(",");
		System.out.println(arr.length);
		System.out.println(arr[0]);
		String[] arr1=str1.split(",");
		System.out.println(arr1.length);
		System.out.println(arr1[0]);
		
		class User{
			int isadmin;

			public int getIsadmin() {
				return isadmin;
			}

			public void setIsadmin(int isadmin) {
				this.isadmin = isadmin;
			}
			
		}
		User sessionUser=new User();
		sessionUser.setIsadmin(1);
		if(sessionUser.getIsadmin()==0||sessionUser.getIsadmin()==1){
			System.out.println("========1=========");
		}
		
		String kong="";
		if(kong.length()==0){
			System.out.println("kong:"+kong.length());
		}
	}

}
