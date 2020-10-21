package domrab;
import java.util.Scanner;
public class masivi2 {


	public static void main(String[] args) {
		
		int[] array = new int [10];
		Scanner scanner = new Scanner(System.in);
		for(int i = 0; i<10; i++) {
			System.out.println("Input a number " + (i+1));
			array[i] = scanner.nextInt();
		}
		for(int i = 0; i<10; i++) {
			int randomIndex = (int) (Math.random() * 10);
			int swap = array[randomIndex];
			array[randomIndex] = array[i];
			array[i] = swap;
		}
		for(int i = 0; i<10; i++) {
			System.out.print(array[i] + " ");
		}
	}
	

}
