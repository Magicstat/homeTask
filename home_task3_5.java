package home_task3;

public class home_task3_5 {

	public static void main(String[] args) {
		int num[] = new int[10];						//massiv int s 10 peremennymi
		int[] numCheck = {-4,2,3,6,5,9,7,-8,6,2};		//znacheniya peremennyh massiva
		int a=1;										//peremennaya dlya proizvedeniya	
		int i=0;							
			while(numCheck[i]!=0 && i<9){				//sravnenie 0 s kagdym znacheniem massiva ne dalshe poslednego ego elementa
				a=a*numCheck[i];						//proizvedieni znachenii do pervogo 0 massiva	
				i++;								
			}			
	
		System.out.println("Proizvedenie do pervogo 0 = "+a); 		//vyvod proizvedeniya
	}

}
