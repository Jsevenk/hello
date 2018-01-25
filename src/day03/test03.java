package day03;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class test03 {
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("0.00");
		df.format(7.0/9);
		System.out.println(df.format(7.0/9));
		//DecimalFormat的返回值是String
		
		Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("a", 6);
        map.put("c", 2);
        map.put("d", 3);
        map.put("b", 4);
        
        //这里将map.entrySet()转换成list
        List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(map.entrySet());
        //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<String,Integer>>() {
            //升序排序
            public int compare(Entry<String, Integer> o1,
                    Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
            
        });
        for(Map.Entry<String,Integer> mapping:list){ 
            System.out.println(mapping.getKey()+":"+mapping.getValue()); 
       }
	}
}
