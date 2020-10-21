package domrab;

import java.util.Scanner;
public class project071 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String mess1 = scanner.nextLine();
		String mess2 = scanner.nextLine();
		scanner.close();
		
		boolean isAnAnagram = true;
		String copyMess2 = mess2;
		int lengthOfMess1 = mess1.length();
		
		for(int i = 0; i < lengthOfMess1; i++) {
			char charInMess1 = mess1.charAt(i);
			if(charInMess1 >= 'a' && charInMess1 <= 'z' || charInMess1 >= 'A' && charInMess1 <= 'Z') {
				int possitionInMess2 = copyMess2.indexOf(charInMess1);
				if(possitionInMess2 == -1) {
					isAnAnagram = false;
					break;
				}else {
					copyMess2 = copyMess2.substring(0, possitionInMess2) + copyMess2.substring(possitionInMess2 + 1);
				}
			}
		}
		
		if(isAnAnagram) {
			int charsLeftInMess2 = copyMess2.length();
			for(int i = 0; i < charsLeftInMess2; i++) {
				char churrentChar = copyMess2.charAt(i);
				if(churrentChar >= 'a' && churrentChar <= 'z' || churrentChar >= 'A' && churrentChar <= 'Z') {
					isAnAnagram = false;
					break;
				}
			}
		}
		
		System.out.println(isAnAnagram ? "It's an anagram." : "It isn't an anagram.");
		
		}

}