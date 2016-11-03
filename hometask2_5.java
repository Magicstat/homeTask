package home_task2;

public class hometask2_5 {

	public static void main(String[] args) {
		int w=177;// wes polzovatelya
		int h=190;// rost polzovatelya
		int k=(h-w);//koeficient wes-rost
		if(k==100){
			System.out.println("Your weight is Perfect!!!");	
		}
		if (95<=k && k<105){
			System.out.println("Your weight is Good!");
		}
		else 
			if (k>95){
				System.out.println("You need NABRAT'");
			}
			else{
				System.out.println("You need POHUDET'");		}
		
	}

}
