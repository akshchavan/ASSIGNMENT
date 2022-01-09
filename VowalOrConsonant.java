//Java Program to Check Whether an Alphabet is Vowel or Consonant.

package Assignment_9;

public class VowalOrConsonant {
	
	 public static void vowal_consonant(char y) {
		 if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u'){
			 System.out.println("this is vowal alphabate..");
		 }
		 else {
			 System.out.println("this is consonant alphabate..");
		 }
	 }

	public static void main(String[] args) {
		
		vowal_consonant('i');
		vowal_consonant('z');
	}

}
