package home_task2;

import java.util.Scanner;

public class hometask2_2 {

	public static void main(String[] args) {
        System.out.println("Введите 2 числа:");
        Scanner myScaner = new Scanner(System.in);
        int a = myScaner.nextInt();//считываем целое число a
        int b = myScaner.nextInt();//считываем целое число b
        if (a>b){
        	System.out.print(a+" больше "+b);
        }
        else System.out.print(b+" больше "+a);

	}

}
