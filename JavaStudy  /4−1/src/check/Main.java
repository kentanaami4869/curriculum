package check;

import constants.java.Constants;

public class Main {

	public static void main(String[] args) {
		String firstName = "Tanaami";
	    System.out.print(firstName);
		String lastName = "Ken";
		System.out.println(lastName);

	
		Pet pt = new Pet(Constants.CHECK_CLASS_JAVA,"hoge");
		pt.introduce();
		
		RobotPet pr = new RobotPet(Constants.CHECK_CLASS_R2D2,"ルーク");
		pr.introduce();
	}

}
