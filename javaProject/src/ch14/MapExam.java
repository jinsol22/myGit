package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class MapExam {
	public static void main(String[] args) {
		Map<String,String>map=new HashMap<>();
		map.put("한국", "서울");
		System.out.println(map.get("한국"));
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국", "워싱턴");
		map.put("태국", "방콕");
		map.put("영국", "런던");
		System.out.println(map);
		String nation="영국";
		System.out.println(nation+"의 수도는 "+map.get(nation));
		
		Iterator<String> iterator=map.keySet().iterator();
		while (iterator.hasNext()) {
			String key=(String)iterator.next();
			System.out.print("key="+key);
			System.out.print(",value="+map.get(key));
		}
		List<String > nations=new ArrayList<>();
		nations.add("영국");
		nations.add("한국");
		nations.add("중국");
		nations.add("미국");
		nations.add("미국");
		List<String> city=new ArrayList<>();
		city.add("런던");
		city.add("서울");
		city.add("북경");
		city.add("워싱턴");
		city.add("동경");
		
		nation="영국";
		for(int i=0; i<nations.size(); i++) {
			if(nations.get(i).equals(nations)) {
				System.out.println(nations.get(i)+"의 수도는"+city.get(i));
				break;
			}
		}
	}
}
