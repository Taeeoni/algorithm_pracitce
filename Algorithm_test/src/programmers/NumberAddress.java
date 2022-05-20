package programmers;

import java.util.*;

public class NumberAddress {

	public static void main(String[] args) {
		String s = "aabbaccc";
		int answer_now = 0;
		int answer = 0;
		String slash;
		List<String> list = new ArrayList<String>();
		for (int i = 1; i < s.length(); i++) {

			for (int j = 0; j < s.length(); j += i) {

				if (i + j > s.length()) {
					list.add(s.substring(0 + j, s.length()));
				} else {
					list.add(s.substring(0 + j, i + j));
				}

			}
			
			answer_now = s.length() + list.size();
			for (int j = 0; j < list.size() - 1; j++) {
				
				if (list.get(j).equals(list.get(j + 1))) {
					answer_now -= i;
				} else {
					answer_now -= 1;
				}
				
			}
			answer = Math.min(answer_now, (s.length() + list.size()));
			System.out.println(answer);
			list.removeAll(list);
		}
		
		System.out.println(answer);
	}

}
