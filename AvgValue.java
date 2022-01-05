//Write a Java program to calculate the average value of array elements 

package Assignment_1;

public class AvgValue {

	public static void main(String[] args) {
		int num []= {20, 30, 25, 35, -16, 60, -100};
		int sum=0;
		
		for(int i : num)
		sum += i;
		
		int avg = sum/num.length;
		
		System.out.println("avg value is : "+ avg);

	}

}
