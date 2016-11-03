package home_task2;

public class hometask2_4 {

	public static void main(String[] args) {//god visokosnyy esli kraten 4 i ne katen 100 odnovremonno, no kraten 400
		int year=2100;// vvesti luboi god
		if(year%4==0 && year%100!=0 || year%400==0){
			System.out.print(year+" god - visokosnyy");
		}
		else System.out.print(year+" god - ne visokosnyy");
	}
	

}
