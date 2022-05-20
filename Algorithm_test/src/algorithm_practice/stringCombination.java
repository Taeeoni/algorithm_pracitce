package algorithm_practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stringCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<String> strList = new ArrayList<>();
		int n = scan.nextInt();
		scan.nextLine(); // ¡÷¿« 

		for (int i = 0; i < n; i++) {
			String s = scan.nextLine();
			strList.add(s);
		}

		for (int i = 0; i < strList.size(); i++) {

			if (i == strList.size() - 1) {
				System.out.print(strList.get(i) + ".");
			} else {
				System.out.print(strList.get(i) + ",");
			}

		}
	}
}
