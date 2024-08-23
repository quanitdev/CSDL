package dequy;

public class TongS {
public static int S(int n) 
{
	if (n==1) return 1;
	else return n+S(n-1);
	
}
public static void main(String[] args) {
	 System.out.print("Tong tu 1-->5 la:"+S(5));
}
}