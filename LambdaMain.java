package com.practice.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LambdaMain {

	public static void main(String[] args) {
List<Map<String,String>> l =  new ArrayList<>();
HashMap<String, String> map =  new HashMap<>();
HashMap<String, String> map1 =  new HashMap<>();
HashMap<String, String> map2 =  new HashMap<>();
HashMap<String, String> map3 =  new HashMap<>();
map1.put("A", "1");
map1.put("c", "1");
map1.put("d", "1");
l.add(map1);
map2.put("A", "1");
map2.put("e", "1");
map2.put("A", "1");
l.add(map2);
map3.put("r", "1");
map3.put("A", "1");
map3.put("j", "1");
l.add(map3);
map.put("A", "1");
map.put("k", "1");
map.put("d", "1");
l.add(map);

System.out.println(l);

Collections.sort(l, (s,s1)->{
	//s.keySet().
	return -1;
});

	}

}
