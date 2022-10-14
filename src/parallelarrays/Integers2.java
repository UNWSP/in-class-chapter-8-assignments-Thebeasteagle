package parallelarrays;

public class Integers2 {
	public static void main(String[] args)
	{
		double[] a = new double[5]; 
		int k=0;
		for (int i=0; i<a.length;i++) {
			a[i]=Math.pow(2, i+1);
		}
		for (double x:a) {
			System.out.print(x + ", ");
		}
		System.out.println("\n");
		for (int i=4;i>=0;i--) {
			System.out.print(a[i] + ", ");
		}
	}
}
