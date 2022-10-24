package check;


import constants.Constants;

public class Main {
	
	
		// TODO 自動生成されたメソッド・スタブ
		private static String firstName = "Tanaami";
	    private static String lastName = "Ken";
		
	    private void printName(String firstName,String lastName) {
	    	System.out.println(firstName + lastName);
	    }
	    
	    public static void main(String[] args) {
	    
	    Main printName = new Main();
	    printName.printName(firstName,lastName);	
	    	
	    Pet pt = new Pet(Constants.CHECK_CLASS_JAVA,Constants.CHECK_CLASS_HOGE);
		pt.introduce();
		
		
		RobotPet pr = new RobotPet(Constants.CHECK_CLASS_R2D2,Constants.CHECK_CLASS_LUKE);
		pr.introduce();
		
	    
	}

}