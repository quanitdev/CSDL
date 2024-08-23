package dequy;

public class Fibonaci {
 public static int f (int n)
 {
	 if((n==1) || (n==2)) return 1;
	 else return f(n-1)+ f(n-2);
 }
 public static void main(String[] args) {
	 System.out.print("So hang thu n cua fibonaci là:"+f(8));
 }
}
