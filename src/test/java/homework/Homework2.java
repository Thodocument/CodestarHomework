package homework;

import java.util.Scanner;

public class Homework2 {
	public static void main(String[] args) {
		// Nhập hai số từ bàn phím và in ra số lớn hơn
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào số thứ nhất:");
		int num1 = scan.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		int num2 = scan.nextInt();
		if (num1 > num2) {
			System.out.println("Số lớn hơn là: " + num1);
		} 
		else {
			System.out.println("Số lớn hơn là: " + num2);
		}
	}
}