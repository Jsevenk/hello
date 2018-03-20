package day04;

import java.util.HashMap;
import java.util.Iterator;
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
        System.out.println("===========================");
        System.out.println("keySet是怎么遍历的？");
        Map<String,String> map1=new HashMap<String,String>();
        map1.put("one", "1");
        map1.put("two", "2");
        map1.put("three", "3");
        map1.put("four", "4");
        map1.put("five", "5");
        map1.put("six", "6");
        for(String str:map1.keySet()){
        	System.out.println("key:"+str);
            System.out.println("value:"+map1.get(str));
        }
//        网上的结论：
//        Hashtable.keySet()          降序
//        TreeMap.keySet()            升序
//        HashMap.keySet()            乱序
//        LinkedHashMap.keySet()      原序
        System.out.println("hashMap的keySet是乱序的");
        System.out.println("===========================");
        System.out.println("map数据的删除");
        //推荐使用：效率高,以后一定要使用此种方式
        Iterator iter = map1.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry entry = (Map.Entry) iter.next();
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key+  ":"  + val);
            if(entry.getValue().equals("2")){
                System.out.println("删除");
                iter.remove();
            }
        }
        System.out.println("删除后遍历");
        for(String str:map1.keySet()){
        	System.out.println("key:"+str);
            System.out.println("value:"+map1.get(str));
        }
        //js遍历map
/*        for(var key in map){
        	  console.log("属性：" + key + ",值：" + map[key]);
        }*/
	}

}
