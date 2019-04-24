package com.collectionsEx;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsEx {

	public static void main(String[] args) {

		// HashMap
		HashMap<Integer, String> hmap = new HashMap<Integer, String>();
		hmap.put(101, "B");
		hmap.put(100, "Z");
		hmap.put(102, "B");
		hmap.put(103, "A");
		System.out.println();
		System.out.println("HashMap");
		
		for (Map.Entry<Integer, String> e : hmap.entrySet()) {

			System.out.println("HashMap:" + e.getKey() + "-" + e.getValue());

		}

		// LinkedHashMap
		Map<Integer, String> lhashmap = new LinkedHashMap<Integer, String>();
		lhashmap.put(200, "Z");
		lhashmap.put(201, "A");
		lhashmap.put(202, "C");
		System.out.println();
		System.out.println("LinkedHashMap");
		
		for (Map.Entry<Integer, String> en : lhashmap.entrySet()) {
			System.out.println("LinkedHashMap:" + en.getKey() + " -" + en.getValue());

		}

		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(301, "C");
		treemap.put(303, "D");
		treemap.put(300, "A");
		treemap.put(302, "G");
		System.out.println();
		System.out.println("TreeMap");
		
		for (Map.Entry<Integer, String> ent : treemap.entrySet()) {

			System.out.println("treemap :" + ent.getKey() + " " + ent.getValue());

		}

	}

}
