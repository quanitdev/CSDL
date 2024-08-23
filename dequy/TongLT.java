package dequy;

public class TongLT {
	public static int lt (int x ,int n) 
	{
		if (n==0) return 1;
		else return x*lt(x,n-1);
		
	}
	public static int tonglt(int n) {
		if(n==1)return 1;
		else return lt(n,n)+ tonglt(n-1);
	}
		public static void main(String[] args) {
			 System.out.print("Tong luy thua la:"+tonglt(3));
		}
	}

   /* private static long TongMu(int n) {
        // Điều kiện dừng
        if (n == 0) {
            return 0;
        }

        // Tính tổng của bình phương các số từ 1 đến n - 1
        long sum = TongMu(n - 1);

        // Thêm bình phương của n vào tổng
        sum += n * n;

        return sum;
    }
    public static void main(String[] args) {
        System.out.println("S = " + TongMu(12));
    }
}*/