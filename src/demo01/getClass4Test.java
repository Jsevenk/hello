package demo01;
/**
 * getclass()的对象为null时，会抛出空指针异常
 * @author jsevenk
 *
 */
public class getClass4Test {

	public static void main(String[] args) {
		try{
			String a=null;
			a.getClass();
			System.out.println(a.getClass());
		}catch(NullPointerException e){
			System.out.println("NullPointerException");
			e.printStackTrace();
		}
	}

}
