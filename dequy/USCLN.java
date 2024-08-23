package dequy;

public class USCLN {
public int us(int a, int b)
{
	if (a==b) return a;
	else if (a>b) return us(a-b,b);
	else return us(a,b-a);
}
}
