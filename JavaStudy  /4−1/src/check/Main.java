package check;

public class Main {

	public static void main(String[] args) {
		String firstName = "Tanaami";
	    System.out.print(firstName);
		String lastName = "Ken";
		System.out.println(lastName);

		Pet pt = new Pet("java吉","hoge");
		pt.introduce();
		RobotPet pr = new RobotPet("R2D2","ルーク");
		pr.introduce();
	}

}
