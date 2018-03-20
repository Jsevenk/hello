package day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class test05 {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "one");
		map.put(2, "two");
		map.put(3, "three");
		Set<Integer> set=map.keySet();  
        for(Integer i:set){  
        	System.out.println("key:"+i);
            System.out.println("value:"+map.get(i));  
        }
        System.out.println("change key=3 value to '三'");
        map.put(3, "三");
        for(Integer i:set){  
        	System.out.println("key:"+i);
            System.out.println("value:"+map.get(i));  
        }
	}

}
