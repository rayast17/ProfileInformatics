package domrabinformatika;

import java.util.Scanner;
public class Paint {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Insert height:");
        double height = scanner.nextDouble();
        System.out.println("Insert length:");
        double length = scanner.nextDouble();
        System.out.println("Insert width:");
        double width = scanner.nextDouble();

        double paintArea = length*width + 2*height*(length+width);
        System.out.println("Area: "+paintArea);

        int fiveLiterBucketsNeeded = (int)(Math.floor(paintArea/140));

        double areaLeftToPaint = paintArea-fiveLiterBucketsNeeded*140;

        int oneLiterBucketsNeeded = (int) Math.ceil(areaLeftToPaint/30);

        if(paintArea<140){

            System.out.println("You need "+oneLiterBucketsNeeded+" 1-liter buckets and that will cost you $"+oneLiterBucketsNeeded*4+".");
        }else{

            if(areaLeftToPaint==0){

                System.out.println("You need "+fiveLiterBucketsNeeded+" 5-liter buckets and it will cost you $"+fiveLiterBucketsNeeded*15+".");
            }else{

                System.out.println("You need "+fiveLiterBucketsNeeded+" 5-liter buckets and "+oneLiterBucketsNeeded+" 1-liter buckets" +
                        " and it will cost you $"+(fiveLiterBucketsNeeded*15+oneLiterBucketsNeeded*4)+".");
            }
        }
    }
}
