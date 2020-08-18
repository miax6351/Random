
public class RandomArray {

	static int[] myArray = new int[100];
	
public static void main(String[] args) {
		
		for (int i = 0; i < myArray.length; i++) {
			
			int Random = (int)(Math.random()*100);
			
			myArray[i] = Random;

			
			System.out.println(myArray[i]);
			
		}
		
		

		
		
		
	}
	
}
