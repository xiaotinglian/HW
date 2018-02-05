import java.util.Scanner;
class Circle{

   static Scanner input = new Scanner(System.in);
   public static void main(String args[])
   {
      System.out.println("Enter the radius: ");
 
      double radius = input.nextDouble();
      double area = Math.PI * Math.pow(radius, 2);
      System.out.println("The area of circle is: " + area);
   }
}