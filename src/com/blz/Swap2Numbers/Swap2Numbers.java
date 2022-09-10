package com.blz.Swap2Numbers;
import java.util.Scanner;
public class Swap2Numbers {

	public static void main(String[] args) {
		System.out.println("Welcome to SwapNumbers Program!!");
		int a,b;
		System.out.println("enter the Two Number:");
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("Before Swapping"+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping"+a+" "+b);

	}

}
