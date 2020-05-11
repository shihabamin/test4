package assinmentTwo;

public class MultiDimentionArray {
	
	int b = 8;
	
	public MultiDimentionArray() {
		
	}

	public static void myMethod(String fname) {
		System.out.println(fname + " chowdhury");
	}
	
	public static void myMethod(String fname, int age) {
		System.out.println(fname + " chowdhury," + "age is " + age );
	}
	
	public static int myMethod(int x) {
	    return  x;
	  }
	

	public void print() {
		System.out.println("print me");
	}
	
	

	public static void main(String[] args) {
		
		MultiDimentionArray mda = new MultiDimentionArray();

		mda.print();
		
		myMethod("shah");
		myMethod("tazin");
		myMethod("Daiyan");
		myMethod("Zareen", 8);
		int newValue= myMethod(22);
		
		System.out.println(newValue);
		

	}
	
	

}
