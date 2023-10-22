package homework;

public class Homework3 {
	public static void main(String[] args) {
		// in ra các số chia hết cho 5 từ 1 đến 100
		for(int i = 0; i <= 100; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
