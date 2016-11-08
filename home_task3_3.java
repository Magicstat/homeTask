package home_task3;

public class home_task3_3 {

	public static void main(String[] args) {
		int num[] = new int[15];									//massiv int s 10 peremennymi
		int[] numCheck = {4,-2,3,-4,3,6,7,-8,3,-7,3,-65,2,-4,2};	//znacheniya peremennyh massiva
		int i=0;													//peremennaya nomera v massive
		int b=0;;														
		int a=numCheck[i];																
		for(i=1;i<15;i++){											//for dlya 15 peremennyh massiva
			if(a>numCheck[i]){										//sravnenie pervogo znacheniya massiva s kagdym posleduuschim
				a=numCheck[i];
				b=i;//prisvaivanie naimen'shego
			}	
		}
		System.out.println("min value = "+a+" Number - "+b); 			//vyvod

	}

}
