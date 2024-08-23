package SAPXEP;
import java.util.Scanner;
public class TimKiemNhiPhan {
int TimKiemNhiPhan (int array[], int x,int low,int high) {
	if(high >=low) {
		int mid =low + (high - low)/2;
		if(array[mid]==x)
			return mid;
		if ( array[mid] >x)
			return TimKiemNhiPhan(array,x,low,mid-1);
		return TimKiemNhiPhan (array,x,mid+1,high);
	}
	return -1;
}
public static void main(String args[]) {
	TimKiemNhiPhan ob=new TimKiemNhiPhan();
	int array[]= {3,4,5,6,7,8,9};
	int n= array.length;
	Scanner sc= new Scanner(System.in);
	System.out.println("Nhap gia tri can tim:");
	int x=sc.nextInt();
	int result =ob.TimKiemNhiPhan(array, x, 0, n-1);
	if(result == -1)
		System.out.println("Not found");
	else
		System.out.println("Element found at index "+ result);
}
}
