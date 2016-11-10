package home_task4;

public class home_task4_2 {

	public static void main(String[] args) {
		String s = "kf5j wkrj щкуц 87hjh 43434%$%@%@#";
		s = s.replaceAll("[^A-Za-zА-Яа-я]", "");
		System.out.print(s);
	}

}
