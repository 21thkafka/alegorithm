package algorithm;


public class makingBinary {

	public void printInBinary(int n){

		
		if(n<2) {
			System.out.print(n);
		} else {
			printInBinary(n/2);
			System.out.print(n%2);
		}
	}
	
}
