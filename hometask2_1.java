package home_task2;

public class hometask2_1 {

	public static void main(String[] args) {
		String text="Moroz i solnce den chudesnyy";
		int n=text.length();//number of symbols
		System.out.println(n);
		int half=n/2;
		String half1 =text.substring(0,half);
		String half2 =text.substring(half+1);
		System.out.println(half1);
		System.out.println(half2);
	}

}
