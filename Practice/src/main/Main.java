package main;

import java.util.Scanner;

import classes.Somebody;

public class Main {

	public static void main(String[] args) {
		Somebody.c();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합");
		int input = 0;
		
		input = Integer.parseInt(sc.nextLine());
		int num = 0;
		int sum = 0;
		while(num < input) {
			sum += ++num;
		}
		
		System.out.println(sum);
	}

}
