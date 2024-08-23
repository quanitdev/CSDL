package Tree;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BinaryTree obj= new BinaryTree();
obj.creat();
System.out.println("Duyệt cây theo trái_gốc_phải");
obj.duyet();
System.out.println("Hiển thị có điều kiện là:");
obj.printIf();
obj.timkiem("01");
obj.deleteKey("03");
System.out.println("Sau khi xóa là:");
obj.duyet();
	}
}
