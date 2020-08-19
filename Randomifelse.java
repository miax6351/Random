
public class Randomifelse {

	static int[] myArray = new int[100];

	public static void main(String[] args) {

		for (int i = 0; i < myArray.length; i++) {

			int Random = (int) (Math.random() * 100);

			myArray[i] = Random;


		}

		int max = myArray[0];

		for (int i = 1; i < myArray.length; i++) {

			if (myArray[i] > max) {
				max = myArray[i];
				
			}

			
		}

		System.out.println(max);

	}

}
