package algorithm_practice;

public class StringBuilder_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder sb = new StringBuilder(" ");
		
		for(int i = 0; i < 100000; i++) {
			sb.append("!");
		}
	}

}
