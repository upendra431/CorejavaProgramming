package com.upendra;

import java.util.HashMap;
import java.util.Map;

public class Map1 
{
public static void main(String[] args) {
	Map<StringBuffer,String> map=new HashMap<>();
	map.put(new StringBuffer("1"), "One");
	map.put(new StringBuffer("1"), "1");
	map.forEach((k,v)->{
		System.out.println(k+" : "+v);
	});
}
}
