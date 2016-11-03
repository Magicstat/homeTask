package home_task2;
import java.util.Scanner;
public class hometask2_6 {

	public static void main(String[] args) {
		System.out.print("Enter from 1 to 999: ");
		Scanner myScanner= new Scanner(System.in);
		int a= myScanner.nextInt();
		if ((a-1)%10==0 && a!=11){
			System.out.print(a+" rubl'");
		} else if(11<a && a<20){
			System.out.println(a+ " rublei");
		} else if ((a-2)%10==0 || (a-3)%10==0 || (a-4)%10==0){
			System.out.println(a+ " rublya");
		}
		else System.out.println(a+ " rublei");
	}

}
