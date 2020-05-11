package assinmentTwo;

public class ArrayPractice {

	public static void main(String[] args) {

		String[][] car = { { "Volvo", "BMW", "Ford", "Mazda" }, { "Honda", "Nissan" } };
		

		String[] car1 = { "Volvo", "BMW", "Ford", "Mazda" };

		 //car[1] = "Tata";

		 //System.out.println(car[0][1]);

		/*
		 * for(int i = 0; i < car.length; i++ ) { System.out.println(car[i]); }
		 * 
		 * for (String i : car) { System.out.println(i); }
		 */

		for (int i = 0; i < car.length; i++) {

			for (int y = 0; y < car[i].length; y++) {

				System.out.println(car[i][y]);

			}

		}

	}

}
