package dequy;

public class TongGT {
	public static int gt(int n) 
	{
		if(n==0) return 1;
		else return n*gt(n-1);
	}
	public static int tonggt(int n) {
		if(n==1)return 1;
		else return gt(n)+ tonggt(n-1);
	}
	public static void main(String[] args) {
        int n = 3; 
        int result = tonggt(n);
        System.out.println("S = 1! + 2! + ... + " + n + "! = " + result);
    }
}

 /*   // Hàm tính giai thừa
    static int S(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * S(n - 1);
        }
    }

    // Hàm tính tổng 1! + 2! + ... + n!
    static int TongGT(int n) {
        if (n == 1) {
            return 1;
        } else {
            return S(n) + TongGT(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 12; // Bạn có thể thay đổi giá trị của n tại đây
        int result = TongGT(n);
        System.out.println("S = 1! + 2! + ... + " + n + "! = " + result);
    }
}*/