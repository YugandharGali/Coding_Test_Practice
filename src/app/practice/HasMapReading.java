package app.practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringJoiner;

public class HasMapReading {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Map<String, String> mp = new HashMap();
		mp.put("A", "aaa");
		mp.put("B", "bbb");
		mp.put("C", "ccc");
		
		System.out.println(".......java 8..............");
		mp.forEach((key,value) -> System.out.println(key + " = " + value));
		
		
		System.out.println("for each........");
		for(Map.Entry<String, String> entry : mp.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("for each keySet........");
		for(String key : mp.keySet()) {
			System.out.println(key + " = " + mp.get(key));
		}
		
		
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		for (Map.Entry<String, String> entry : map.entrySet()) {
		    System.out.println(entry.getKey() + " = " + entry.getValue());
		}
		
		System.out.println("Iterator...........");
		Iterator<Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> pair = (Map.Entry<String, String>) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
		}
		
		
		StringJoiner strJoiner = new StringJoiner(".");
		strJoiner.add("AAA").add("BBB");
		System.out.println(strJoiner);
		
	}
}
