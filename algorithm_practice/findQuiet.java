package algorithm_practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class findQuiet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		List<int[]> shade = new ArrayList<>();
		
		//x 좌표
		int a = scan.nextInt();
		//y 좌표
		int b = scan.nextInt();
		// R 소음의 크기 
		int R = scan.nextInt();
		// N 나무그늘의 수
		int N = scan.nextInt();
		
		for(int i = 0; i < N; i++) {
			
			int xy [] = new int [2];
			xy[0] = scan.nextInt();
			xy[1] = scan.nextInt();
			
			shade.add(xy);
		}
		
		String answer = "noisy";
		
		for(int i = 0; i < shade.size(); i++) {
			
			int xy [] = shade.get(i);
			int x = xy[0] - a;
			int y = xy[1] - b;
			
			if((x*x + y*y) >= R*R) {
				answer = "silent";
			}
			
			System.out.println(answer);
		}
		
		
		
	}

}
