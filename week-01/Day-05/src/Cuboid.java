import java.util.Scanner;
public class Cuboid {
    public static void main(String[] args) {
        // Write a program that stores 3 sides of a cuboid as variables (doubles)
// The program should write the surface area and volume of the cuboid like:
//
// Surface Area: 600
// Volume: 1000

        Scanner myObj = new Scanner(System.in);

        System.out.println("Please enter the height of Cuboid: ");
        int height = myObj.nextInt();


        System.out.println("Please enter the length of Cuboid: ");
        int length = myObj.nextInt();


        System.out.println("Please enter the width of Cuboid: ");
        int width = myObj.nextInt();

        int surfaceArea = (2*length*width)*(2*length*height) * (2*height*width);
        System.out.println("Surface Area of Cuboidis: " + surfaceArea);

        int volume = height * width*length;
        System.out.println("Volume of Cuboidis: " + volume);





    }
}
