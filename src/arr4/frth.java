package arr4;



public class frth {


	public static void main(String[] args) {

		String letters = "ABeHTeYEDY";


		char[] X = letters.toCharArray();


		// display all e's and E's and index

		for(int i = 0; i < X.length; i++) {


			if(X[i] == 'e' || X[i] == 'E' ) {
				System.out.print(X[i] + " at the index "+ i + " ,");

			}


		}



	}



}














