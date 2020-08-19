
public class Rightorder {

	static int[] myArray = { 5, 7, 4, 2, 8 };

	public static void main(String[] args) {

		// for (int i = 0; i < myArray.length; i++) {

		// int Random = (int) (Math.random() * 100);

		// myArray[i] = Random;
		// System.out.println(myArray[i]);

		// }

		int temp;
		for (int i = 1; i < myArray.length; i++) {

			if (myArray[i] > myArray[0]) {

				temp = myArray[0];

				myArray[0] = myArray[i];

				myArray[i] = temp;

				for (int j = 0; j < myArray.length; j++) {
					System.out.println(myArray[j]);
				}

			}

		}

		for (int i = 2; i < myArray.length; i++) {

			if (myArray[i] > myArray[1]) {

				temp = myArray[1];

				myArray[1] = myArray[i];

				myArray[i] = temp;

				for (int j = 0; j < myArray.length; j++) {
					System.out.println(myArray[j]);
				}

			}

		}

		for (int i = 3; i < myArray.length; i++) {

			if (myArray[i] > myArray[2]) {

				temp = myArray[2];

				myArray[2] = myArray[i];

				myArray[i] = temp;

				for (int j = 0; j < myArray.length; j++) {
					System.out.println(myArray[j]);
				}

			}

		}

		for (int i = 4; i < myArray.length; i++) {

			if (myArray[i] > myArray[3]) {

				temp = myArray[3];

				myArray[3] = myArray[i];

				myArray[i] = temp;

				for (int j = 0; j < myArray.length; j++) {
					System.out.println(myArray[j]);
				}

			}

		}
		
		
	}

}
