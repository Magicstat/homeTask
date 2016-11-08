package home_task3;

public class home_task3_6 {

	public static void main(String[] args) {
		int num[] = new int[10];
		int[] myNum = {1,2,14,23,3,0,7,8,0,10};
		int i;
		int a=0;
		int b=0;
		for (i=9;0<i;--i){
			b=i;
			for (int j=i;j<10;j++){
				if (myNum[b]==0){
					b=j;
				}
			}
					
			}
			System.out.print(myNum);
	
	}
}
