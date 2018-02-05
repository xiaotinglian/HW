import java.util.Scanner;
class TwoCircles {
	public static void main(String[] args){
    		Scanner input = new Scanner(System.in);
    		System.out.println("Enter Circle 1 X and Y, and radius: ");
		double X1 = input.nextDouble();
		System.out.println("X1="+X1);
    		double Y1 = input.nextDouble();
		System.out.println("Y1="+Y1);
    		double r1 = input.nextDouble();
		System.out.println("radius1="+r1);
   		System.out.println("Enter Circle 2 X and Y, and radius: ");
   		double X2 = input.nextDouble();
		System.out.println("X2="+X2);
    		double Y2 = input.nextDouble();
		System.out.println("Y2="+Y2);
    		double r2 = input.nextDouble(); 
		System.out.println("radius2="+r2);   
    		double dis = Math.sqrt((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2));
    		if (r2 >= r1 && dis <= (r2 - r1)){
        		System.out.println("Circle 1 is inside Circle 2.");
    		}
    		else if (r1 >= r2 && dis <= (r1 - r2) ) {
        		System.out.println("Circle 2 is inside Circle 1.");
    		}
    		else if (dis > (r1 + r2)){
        		System.out.println("Circle 2 does not overlap Circle 1.");
    		}
    		else {
        		System.out.println("Circle 2 overlaps Circle 1.");}
    	}
}