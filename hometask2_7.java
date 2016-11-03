package home_task2;
import java.util.Scanner;
public class hometask2_7 {

	public static void main(String[] args) {
		System.out.print("Enter number of days week: ");
		Scanner myScanner = new Scanner(System.in);
		int a=myScanner.nextInt();
		switch (a){
		case 1: System.out.println("Ponedelnik");
		break;
		case 2: System.out.println("Wtornik");
		break;
		case 3: System.out.println("Sreda");
		break;
		case 4: System.out.println("Chetverg");
		break;
		case 5: System.out.println("PYATNICA");
		break;
		case 6: System.out.println("Subbota");
		break;
		case 7: System.out.println("Woskresenie");
		break;
		default: System.out.println("Net takogo nomera dnya nedeli");
		}
		
	}

}
