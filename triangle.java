import java.util.Scanner;
import java.lang.Math;
class Triangle{
   public static void main(String[] args){
	Scanner input = new Scanner(System.in);

      	System.out.println("first point of X and Y cordinate");
 	double X1=input.nextDouble();
	System.out.println("X1="+X1);
	double Y1=input.nextDouble();
	System.out.println("Y1="+Y1);
	System.out.println("second point of X and Y cordinate");
 	double X2=input.nextDouble();
	System.out.println("X2="+X2);
	double Y2=input.nextDouble();
	System.out.println("Y2="+Y2);
	System.out.println("first point of X and Y cordinate");
 	double X3=input.nextDouble();
	System.out.println("X3="+X3);
	double Y3=input.nextDouble();
	System.out.println("Y3="+Y3);
	
	double a=X2-X1;
	double b=Y2-Y1;
	double c=X3-X1;
	double d=Y3-Y1;
	double e=X3-X2;
	double f=Y3-Y2;
	double line1 = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
	double line2 = Math.sqrt(Math.pow(c,2)+Math.pow(d,2));
	double line3 = Math.sqrt(Math.pow(e,2)+Math.pow(f,2));

	if ( (line1 + line2) >line3 && (line1 +line3) >line2){
		System.out.println("real triangle");
	}
	else{
		System.out.println("fake triangle");
	}
   }
}