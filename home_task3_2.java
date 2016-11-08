package home_task3;

public class home_task3_2 {

	public static void main(String[] args) {
		int num[] = new int[10];						//massiv int s 10 peremennymi
		int[] numCheck = {4,-2,3,-4,3,6,7,-8,3,-7};		//znacheniya peremennyh massiva
		int i=0;										//peremennaya nomera v massive
		int a=numCheck[i];								
		int b=numCheck[i];								
		for(i=1;i<10;i++){								//for dlya 10 peremennyh massiva
			if(a>numCheck[i]){							//sravnenie pervogo znacheniya massiva s kagdym posleduuschim
				a=numCheck[i];							//prisvaivanie naimen'shego
			}	
			if(b<numCheck[i]){							//sravnenie pervogo znacheniya massiva s kagdym posleduuschim
				b=numCheck[i];							//prisvaivanie naibolshego
			}
		}
		System.out.println("min value = "+a); 							//vyvod naimenshego
		System.out.println("max value = "+b); 							//vyvod naibolshego
	}

}
