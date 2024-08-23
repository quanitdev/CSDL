package dequy;

public class Khudequy {
	public static int gt(int n) {
		int gt=1;
		for (int i=1; i<=n; i++) {
			gt *=1;
		}
		return gt;
	}
    public static void main(String[] args) {
        int n = 3;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * gt(i - 1);
        }
        System.out.println("S = " + sum);
    }
}

	   /* private static int gt(int n) {
	        // Điều kiện dừng
	        if (n == 0) {
	            return 1;
	        }

	        // Trả về tổng giai thừa
	        return n * gt(n - 1);
	    }*/
