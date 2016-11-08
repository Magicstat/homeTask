package home_task3;

public class home_task3_1 {

	public static void main(String[] args) {
		float num[] = new float[10];//novyy massiv float s 10 peremennymi
		Float[] numCheck = {0.1f,1.1f,2.2f,3.3f,4.4f,5.5f,6.6f,7.7f,8.8f,9.9f};// zadaem znacheniya peremennym
		float summ = 0f;
		for(int i=0;i<10;i++){
			System.out.print((numCheck[i])+"|");
			summ = summ+numCheck[i];
		}
		System.out.print("average value = "+summ/10);
	}

}
