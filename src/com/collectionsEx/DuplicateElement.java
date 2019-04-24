package com.collectionsEx;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

	public static void main(String[] args) {

		DuplicateElement.duplicateElementCount();
		DuplicateElement.duplicateInString();

	}

	public static void duplicateElementCount() {

		String names[] = { "Java", "C", "Ruby", "CSharp", "Java", "Java" };

		Map<String, Integer> hashMap = new HashMap<String, Integer>();

		for (String nameContainer : names) {
			Integer count = hashMap.get(nameContainer);
			if (count == null) {
				hashMap.put(nameContainer, 1);

			} else
				hashMap.put(nameContainer, ++count);
		}

		for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Following item has occurrend more than once:::::" + entry.getKey() + "--> "
						+ entry.getValue());
				;

			}

		}

	}

	public static void duplicateInString() {

		String str = "srikantha sri";
		char[] charArray = str.toCharArray();

		Map<Character, Integer> charInMap = new HashMap<Character, Integer>();

		for (Character ch : charArray)

		{

			Integer count = charInMap.get(ch);
			if (count == null) {
				charInMap.put(ch, 1);
			} else {

				charInMap.put(ch, ++count);
			}

		}

		for (Map.Entry<Character, Integer> entry : charInMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate in string:::::" + entry.getKey() + "-->" + entry.getValue());
			}
		}

	}

}
