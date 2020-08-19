
public class TwoVariables {

	static int[] myArray = new int[10];

	public static void main(String[] args) {

		TwoVariables tv = new TwoVariables();

		for (int i = 0; i < myArray.length; i++) {

			myArray[i] = (int) (Math.random() * 100);

		}

		myArray = tv.myFunction(myArray);

		for (int j = 0; j < myArray.length; j++) {
			System.out.println(myArray[j]);
		}

	}

	public int[] myFunction(int[] paraArray) {

		int temp;
		for (int k = 1; k < paraArray.length; k++) {

			for (int i = k; i < paraArray.length; i++) {

				if (paraArray[i] > paraArray[k - 1]) {

					temp = paraArray[k - 1];

					paraArray[k - 1] = paraArray[i];

					paraArray[i] = temp;

				}
			}

		}

		return paraArray;

	}

}
