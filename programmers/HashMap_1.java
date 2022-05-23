package programmers;

import java.util.HashMap;

public class HashMap_1 {

	public static void main(String[] args) {
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put("A","APPLE");
		hashMap.put("B","BANANA");
		hashMap.put("C","CHERRY");
		hashMap.put("D","DURIAN");
		
		System.out.println(hashMap.containsKey("A"));
		System.out.println(hashMap.containsKey("E"));

	}

}
