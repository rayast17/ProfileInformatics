package domrabinformatika;

import java.util.Scanner;

public class project073 {

public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
int numberOfRows = 7;
for (int i = 0; i < numberOfRows; i++) {
for(int j = numberOfRows - i; j>0; j-- ) {
System.out.print(j + " ");
}
for(int j = 2; j <= numberOfRows - i; j ++ ) {
System.out.print(j + " ");
};

System.out.println();
}
}
}
