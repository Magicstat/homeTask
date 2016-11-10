package home_task4;

public class home_task4_3 {

	public static void main(String[] args) {
        String text = "W eetom zadanii nugno udali udalit wse slova iz 5 bukw nachinauschiesya na soglasnuu";
        System.out.println(text);
        
        String[] strArr = text.split(" ");//разбиваем текст на массив слов
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<strArr.length;i++){
           
          char first = strArr[i].charAt(0); // первая буква каждого слова
          
            if(!((strArr[i].length()%5==0)  &&  ((first != 'a')||(first != 'e')||(first != 'i')||(first != 'o')||(first != 'u')||(first != 'y')))){
                                   
                sb.append(strArr[i]).append(" ");
              }                    
        }
           String outText = sb.toString().trim();
        System.out.print(outText+" "+"\n\n");

	}

}
