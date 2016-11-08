package home_task3;

public class home_task3_4 {

	public static void main(String[] args) {
		int num[] = new int[10];						//massiv int s 10 peremennymi
		int[] numCheck = {-4,-2,3,-4,3,6,7,-8,-3,-7};	//znacheniya peremennyh massiva
		int a=0;								
		int b=0;								
		for(int i=0;i<10;i++){							//for dlya 10 peremennyh massiva
			if(0>numCheck[i]){							//sravnenie 0 s kagdym znacheniem massiva
				a=a+1;									//kollichsestvo s +
			}	
			if(0<numCheck[i]){							//sravnenie pervogo znacheniya massiva s kagdym posleduuschim
				b=b+1;									//kollichsestvo s +
			}
		}
		System.out.println("otricatelnyh = "+a); 		//vyvod  s minusom
		System.out.println("pologitelnyh = "+b); 		//vyvod  s plusom

	}

}
