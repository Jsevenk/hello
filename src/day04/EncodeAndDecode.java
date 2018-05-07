package day04;
/**
 * 加密解密
 */
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class EncodeAndDecode {

	public static void main(String[] args) throws UnsupportedEncodingException {
		System.out.println("==============gbk->utf-8==============");
		//java加密
		String aa=URLEncoder.encode("陈婷婷","GBK");
		//java解密	
		String name = URLDecoder.decode(aa, "UTF-8");
		System.out.println(name);
		System.out.println("============================");
		String bb=URLEncoder.encode(name,"UTF-8");
		//java解密	
		String name0 = URLDecoder.decode(bb, "GBK");
		System.out.println(name0);
		System.out.println("==============utf->gbk==============");
		//2
		//java加密
		String dd=URLEncoder.encode("陈婷婷","UTF-8");
		//java解密	
		String name1 = URLDecoder.decode(dd, "GBK");
		System.out.println(name1);
		
		System.out.println("============================");
		String cc=URLEncoder.encode(name1,"GBK");
		String name2 = URLDecoder.decode(cc, "UTF-8");
		System.out.println(name2);
		System.out.println("============================");
		
		/*js加密		encodeURIComponent(value)	
		js解密		java.net.URLDecoder.decode(value,"UTF-8")*/
		
	}

}
