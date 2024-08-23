package dequy;

public class Chuyenhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		np(20);
		System.out.print("\n chuyển hệ 10-->2: "+khunp(20));
	}
	
	public static void np(int n)
	{
		if(n!=0)
		{
			np(n/2);
			System.out.print(n%2);
		}
	}
	//khử đệ quy bài chuyển hệ 10 sang hệ 2
	public static String khunp(int n)
	{
		String kq="";
		/*for(int i=0;n>0;i++)
		{
			kq=(n%2)+kq;
			n/=2;
		}*/
		while(n>0) {
			int soDu=n%2;
			kq=soDu+kq;
			n/=2;
		}
		return kq;
	}
}
