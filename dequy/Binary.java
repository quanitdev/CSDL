package dequy;

public class Binary {
public void chuyenNP(int n)
{
	if(n!=0)
	{
		chuyenNP(n/2);
		System.out.print(n%2);
	}
}
}
