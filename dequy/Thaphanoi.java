package dequy;
public class Thaphanoi {
	public static void thap(int n, int A, int B, int C)
	{
		if(n!=0) {
			thap(n-1,A,C,B);
			System.out.println("Disk "+n+" from coc " + A+" to coc "+C);
			thap(n-1,B,A,C);
		}
	}
	public static void main (String [] args)
	{
		thap(3,1,2,3);
	}
}
