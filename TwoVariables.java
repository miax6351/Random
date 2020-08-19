
public class TwoVariables {

	static int[] myArray = new int[100];

	public static void main(String[] args) {

		for (int i = 0; i < myArray.length; i++) {

			int Random = (int) (Math.random() * 100);

			myArray[i] = Random;

		}

		int temp;
		for (int k = 1; k < myArray.length; k++) {

			for (int i = k; i < myArray.length; i++) {

				if (myArray[i] > myArray[k - 1]) {

					temp = myArray[k - 1];

					myArray[k - 1] = myArray[i];

					myArray[i] = temp;

				}
			}

		}

		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}

	}

}
