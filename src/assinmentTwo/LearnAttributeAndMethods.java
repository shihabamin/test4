package assinmentTwo;

public class LearnAttributeAndMethods {

	int a = 14;
	int c = 232;
	
	public LearnAttributeAndMethods() {
		
	}
	
	public static void abc() {
		
		LearnAttributeAndMethods obj = new LearnAttributeAndMethods();

		System.out.println(obj.a);
		System.out.println(obj.c);
		
	}

	public static void main(String[] args) {

		abc();
		
		LearnAttributeAndMethods obj1 = new LearnAttributeAndMethods();

		obj1.a = 22;
		System.out.println(obj1.a);

		MultiDimentionArray MDA = new MultiDimentionArray();

		System.out.println(MDA.b);

	}

}
