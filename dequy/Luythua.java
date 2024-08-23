package dequy;

public class Luythua {
	public static int lt (int x ,int n) 
	{
		if (n==0) return 1;
		else return x*lt(x,n-1);
		
	}
	public static void main(String[] args) {
		 System.out.print("Luy thua la:"+lt(2,5));
	}
}
