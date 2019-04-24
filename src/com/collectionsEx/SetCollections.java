package com.collectionsEx;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetCollections {

	public static void main(String[] args) {

		HashSet<String> hset = new HashSet<String>();
		hset.add("Zebra");
		hset.add("Monkey");
		hset.add("Ant");
		hset.add("Zebra");
		

		Iterator<String> itr = hset.iterator();
		while (itr.hasNext())
			System.out.println("LinkedHashSet does not maintains insertion order example:" + itr.next());
		System.out.println();

		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Zebra");
		lhset.add("Monkey");
		lhset.add("Ant");
		lhset.add("Zebra");

		Iterator<String> itr1 = lhset.iterator();
		while (itr1.hasNext())
			System.out.println("LinkedHashSet maintains insertion order :" + itr1.next());
		System.out.println();
		TreeSet<String> treeset = new TreeSet<String>();
		treeset.add("Zebra");
		treeset.add("Monkey");
		treeset.add("Ant");
		treeset.add("Zebra");

		Iterator<String> itr2 = treeset.iterator();
		while (itr2.hasNext())
			System.out.println("TreeSet maintains ascending order :" + itr2.next());

	}

}
