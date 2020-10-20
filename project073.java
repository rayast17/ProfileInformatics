package domrab;

import java.util.Scanner;

public class project073 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	    Scanner sc = new Scanner (System.in);

	    System.out.println("Enter integrer");
	    int numberRows = sc.nextInt();
	    for (int i=0;i < numberRows; i++){
	      for (int j = numberRows - i; j>0; j--){
	        System.out.print(j + " ");
	      }
	      for ( int j = 2; j <= numberRows - i; j++){
	        System.out.print(j + " ");
	      }
	      System.out.println();
	    }
	  }
	}