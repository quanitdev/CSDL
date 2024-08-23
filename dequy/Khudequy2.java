package dequy;

public class Khudequy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fibo(8));
		System.out.print("\n so fibo thu 7 la: "+khufibo(8));
	}
	public static int fibo(int n)
	{
		if (n<=2) return 1;
		else return fibo(n-1)+fibo(n-2);
	}
	//khử đệ quy bài Finonacci
	public static int khufibo(int n)
	{
		if(n==0||n==1) return n;
		int a=0;
		int b=1;
		for (int i=2;i<=n;i++) {
			int tg=a;
			a=b;
			b=tg+a;
		}
		return b;
	}
}
