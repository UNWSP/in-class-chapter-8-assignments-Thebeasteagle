package parallelarrays;

public class Integers10 {
	
	public static void main(String[] args){
		int[] tenMultiple = {19,26,35,57,72,80};
		
		for (int x: tenMultiple)
		{
			System.out.println(x);
		}
		
		for (int x=tenMultiple.length - 1; x >= 0; x--)
		{
			int value = tenMultiple[x];
			System.out.println(value);
		}
		
		int sum = 0;
		int count = 0;
		
		for (int x: tenMultiple)
		{
			sum += x;
			count ++;
		}
		System.out.println("The sum of all numbers is: " + sum);
		
		int average = 0;
		average = sum / count;
		
		System.out.println("The average of all numbers is: " + average);
	}
}
		
	
