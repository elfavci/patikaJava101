public class PalindromNumber {
	static boolean isPalindrom(int number) {
		int temp=number,reverseNumber=0,lastNumber;
		while(temp!=0) {
			lastNumber=temp%10;
			reverseNumber=(reverseNumber*10)+lastNumber;
			temp/=10;
		}
		if(number==reverseNumber) {
			System.out.println("Palindrome Number");
			return true;
			
		}
		else {
			System.out.println("not a Palindrome Number");
			return false;
		}
	}
	public static void main(String[] args) {
		isPalindrom(343);
	}
}
