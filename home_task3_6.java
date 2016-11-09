package home_task3;

public class home_task3_6 {

	public static void main(String[] args) {
		int num[] = new int[10];
		int[] myNum = {0,0,3,23,0,0,7,8,5,0};
		int i;
		int lastPosition = 0;
		for(i=0; i<10; i++) {
			if(myNum[i] != 0) {
				myNum[lastPosition++] = myNum[i];
        	System.out.println(myNum[i]);
			}
		}
		for( i=lastPosition; i<10; i++) {
			myNum[i]=0;
			System.out.println(myNum[i]);
		}
	

	}
}
