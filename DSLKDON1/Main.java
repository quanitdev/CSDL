package DSLKDON1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList obj= new LinkList();
		obj.creatList();
		obj.kq();
		obj.xl();
		obj.printList();
		System.out.println("------------------------------------------------------");
		obj.printIf();
		System.out.println("------------------------------------------------------");
		System.out.println("Diem lon nhat la:"+obj.max());
		System.out.println("------------------------------------------------------");
		if(obj.search("it01")==null) System.out.println("Khong xuat hien");
		else System.out.printf("Co xuat hien");
		System.out.println("------------------------------------------------------");
		//else System.out.printf(obj.search("it01").getMaSV(),obj.search("it01").getHoTen(),obj.search("it01").getDiem(),obj.search("it01").getXl());
		System.out.println("Sau khi delete la:");
		obj.delete("it02");
		obj.printList();
		System.out.println("------------------------------------------------------");
		obj.sort();
		obj.printList();
		System.out.println("------------------------------------------------------");
		obj.search1("A");
		obj.printList();
		System.out.println("------------=======------------------------------------------");
	}

}
