package assinmentTwo;

public class LearnIfElse {
	
	static int age = 5;
	
	public static void main(String[] args) {
		
		if(age >= 18) {
			
			System.out.println("access granted.");
			
		}else if(age >= 12 && age < 18) {
			
			System.out.println("prantal guidence required");
			
		}else {
			
			System.out.println("no access");
			
		}
	}

}
