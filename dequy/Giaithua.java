package dequy;

public class Giaithua {
 public static int gthua(int n)
 {
	 if(n==0) return 1;
	 else return n*gthua(n-1);
 }
 public static void main(String[] args) {
	 System.out.print(gthua(5));
 }
}
