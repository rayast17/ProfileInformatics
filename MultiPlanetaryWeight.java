package domrab;

import java.util.Scanner;
public class MultiPlanetaryWeight {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insert your weight on Earth (in kg):");
        double weight = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter a planet of your choice: Mercury, Venus, Mars, Jupiter, Saturn, Uranus, Neptune.");
        String planet = sc.nextLine();
        double convertingCoef = 1;
        switch(planet) {
        case "Mercury" : convertingCoef = 0.38; break;
        case "Venus": convertingCoef = 0.91; break;
        case"Mars": convertingCoef = 0.38; break;
        case "Jupiter": convertingCoef = 2.36; break;
        case "Saturn" : convertingCoef = 0.92; break;
        case "Uranus": convertingCoef = 0.89; break;
        case "Neptune" : convertingCoef = 1.13; break;
        }
        System.out.println("Your weight on "+planet+" is "+convertingCoef * weight);
        }}
       
