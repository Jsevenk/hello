package day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class test04 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<>();
		map.put(1,"2");
		System.out.println(map.get(2));
		if(map.get(2)==null){
			System.out.println("null");
		}
		String aaa=map.get(2)==null?"0":"1";
		System.out.println(aaa);
		
		//map 取值 key value
		map.put(3, "3");
		map.put(4, "4");
		map.put(5, "5");
		Iterator iter = map.entrySet().iterator(); 
		while (iter.hasNext()) { 
		    Map.Entry entry = (Map.Entry) iter.next(); 
		    Object key = entry.getKey(); 
		    Object val = entry.getValue(); 
		    System.out.println("key:"+key);
		    System.out.println("val:"+val);
		}
	}

}
