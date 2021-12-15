package assignment_14_2_2021;
import java.util.*;
public class AreaOfRectangular {
//area of rectangular=length*width
	
	//parameter=2l+2
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value of length:");
	int l = sc.nextInt();
	
	System.out.println("Enter value of Width");
	int w = sc.nextInt();
	
	int area = l*w;
	
	System.out.println("Area of Rectangular:"+area);
	int para=2*l+2*w;
	
	System.out.println("Parameter of Rectangular:"+para);
	
	}

}
