package domrabinformatika;

import java.util.Scanner;
public class project074 {
public static void main (String[] args) {
Scanner sc = new Scanner (System.in);
int numberOfRows = 7;
for(int i = 0; i < numberOfRows; i++) {
for(int j = 0; j < i; j ++) {
System.out.print(" ");
}
for(int j = 0; j < numberOfRows - i; j++) {
System.out.print("*");
};

System.out.println();
}
}
}
