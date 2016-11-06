import java.util.Random;


public class Randomizer {
	
	/*
	 * Method takes in two integers (minimum, maximum)
	 * and returns an integer that is between the 
	 * min, max arguments. 
	 */
	public static int randInt(int min, int max) {
		Random rand = new Random();
		
		int randomNum = rand.nextInt((max-min)+1)+min;
		
		return randomNum;
	}
	
	/*
	 * Method takes in two arrays. The char array contains a letter which
	 * corresponds to a specific event. The int array contains integers
	 * that correspond to the likeliness of a specific event occurring.
	 * Once a random number is chosen, the event is also chosen based on the "groups".
	 * ex: char [A, B, C]  int [25, 25, 50] ('A' has a 25% chance of occurring)
	 * if random number is 32, it falls in the 2nd group of 25. Think number line.
	 * A from 0-24, B from 25-49, and C from 50-99 
	 */
	public static char probability(char [] cases, int [] prob) {
		char opt='d';
		int r = randInt(0,99);
		int cdf = 0;

		for(int i=0; i <cases.length;i++) {
			cdf += prob[i];
			if( r <cdf) {
				opt=cases[i]; 
				break;
			}     
		}	
		return opt;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

