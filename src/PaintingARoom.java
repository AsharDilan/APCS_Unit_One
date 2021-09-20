import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the length of the room?");
    double length = scan.nextDouble();
    System.out.println("What is the width of the room?");
    double width = scan.nextDouble();
    System.out.println("What is the height of the room?");
    double height = scan.nextDouble();
    System.out.println("How many doors do you have?");
    double doors = scan.nextDouble();
    System.out.println("How many windows do you have?");
    double windows = scan.nextDouble();
    double var1 = (length*width + height*length + height*width);
    double var2 = 2*var1;
    double var3 = doors*15;
    double var4 = windows*10;
    double var5 = var2-(var3+var4);
    double var6 = var5/350;
    double var7 = (int)((var5*10));
    double var8 = (int)((var7 + 10 - 1)/10);
    System.out.println("Gallons of Paint Needed:" + var8 );
    }

}
