package Tree;
import java.util.Scanner;

import DSLKDON1.Link;
public class BinaryTree {
public Node root;
//ham dung
public BinaryTree () {
	root=null;
}
// Hàm đệ qui thực hiện việc chèn phần tử vào cây
public Node insertNode(Node root, String maSV,String ht, double diem)
{// nếu cây rỗng trả về Node mới
	if(root ==null)
	{ root = new Node (maSV, ht,diem);
	return root;
	}
	//ngược lại sẽ thực hiện duyệt đọc cây
	if(root.getMaSV().compareTo(maSV)>0)
		 root.left = insertNode(root.left,maSV,ht,diem);
	else if (root.getMaSV().compareTo(maSV)<0)
		root.right = insertNode(root.getRight(),maSV,ht,diem);
	//trả về cây nhị phân đã được thêm phần tử mới
	return root;
}
//public Node insertNode1(Node root,String maSV,String hoTen,double diem) {}
public void creat() {
	boolean ok;
	Scanner scanner = new Scanner(System.in);
	while(ok=true)
	{
		String maSV="";
		System.out.print("Nhập mã sinh viên");
		maSV=scanner.nextLine();
		
		if (maSV.length()==0) { ok= false; break;}
		else 
		{ System.out.print("Nhập họ tên");
		String hoTen= scanner.nextLine();
		System.out.print("Nhập điểm");
		float diem= scanner.nextFloat();
		scanner.nextLine();
		root = insertNode1(root,maSV,hoTen,diem);
		}
	}
}
public void tgp(Node root) {
	if(root !=null) {
		tgp(root.left);
		//root.hoten=root.hoten+"aa";
		System.out.println(root.getMaSV()+ " "+root.getHoTen()+" " +root.getDiem()+" "+root.getKq()+" "+ root.getXl());
		//System.out.println(" Ma SV la:" +root.getMaSV()+ " Họ tên là:" +root.getHoTen() +" Điểm là"+root.getDiem() +root.getKq()+ root.getXl());
		tgp(root.right);
	}
}
public void duyet() {
	kq(root);
	xl(root);
	tgp(root);
	
}

public void duyetIf(Node root) {
	if(root !=null) {
		duyetIf(root.left);
		//root.hoten=root.hoten+"aa";
		if(root.getDiem()>=7) {
		System.out.println(" Ma SV la:" +root.getMaSV()+ " Họ tên là:" +root.getHoTen() +" Điểm là"+root.getDiem()+"Ket qua"+root.getKq()+ root.getXl());};
		duyetIf(root.right);
	}
	}
	
	public void printIf()
	{
		duyetIf(root);
	}
	public void kq(Node root) {
		if(root !=null) {
			kq(root.left);
			if(root.getDiem()>=5) 
		    root.setKq("Dau");
			else 
				root.setKq("Rot");
			kq(root.right);
		}
		}
	public void xl(Node root) {
		if(root !=null) {
			xl(root.left);
			if(root.getDiem()<5) 
		    root.setXl("Kem");
			else 
				if(root.getDiem()<7) 
				    root.setXl("TB");
				else 
			if(root.getDiem()<8) 
			    root.setXl("Kha");
				else
				root.setXl("Gioi");
			xl(root.right);
		}
		}
	public void timkiem(String maSV) {
		Node p = root;
		while(p!=null)
		{
			if(p.getMaSV().compareTo(maSV)>0) 
				p=p.left;
			else if(p.getMaSV().compareTo(maSV)<0) p=p.right;
			else {System.out.println(root.getMaSV()+ " "+root.getHoTen()+" " +root.getDiem()+" "+root.getKq()+" "+ root.getXl()); break;}
			
			if(p==null) System.out.print("Khong tim thay");
			}
		}
	
	public Node insertNode1(Node root,String maSV,String ht, double diem) {
		if(root==null)
		{
			root=new Node(maSV,ht,diem);
		}
		else
		{Node q=null, p=root;
		while(p!=null)
		{
			if(p.getMaSV().compareTo(maSV)>0) {q=p;p=p.left;}
			else if(p.getMaSV().compareTo(maSV)<0) {q=p;p=p.right;}
			else { System.out.print("masv da ton tai;"); break;}
		}
		if(p==null) {
			if(q.getMaSV().compareTo(maSV)>0) q.left=new Node(maSV,ht,diem);
			else q.right=new Node(maSV,ht,diem);
		}
		}
		return root;
		}
	public String minValue(Node root) {
		String minv= root.getMaSV();
		while (root.left!= null)
		{
			minv= root.left.getMaSV();
			root = root.left;
		}
		return minv;
	}
	/* Hàm đệ qui để xóa phần tử*/
	public Node delete(Node root, String maSV)
	{ 
		//trường hợp gốc: nếu node root null
		if(root==null)return root;
		// ngược lại chúng ta sẽ duyệt dọc cây
		if(root.getMaSV().compareTo(maSV)>0)
			root.left=delete(root.left,maSV);
		else if(root.getMaSV().compareTo(maSV)<0)
			root.right=delete(root.right,maSV);
		//nếu key có cùng giá trị với node key thì chính là node cần xóa
		else
		{
			//node ko có hoặc chỉ có 1 node con
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
			// node có 2 node con
			root.setMaSV(minValue(root.right));
			//xóa phần tử nhất bên phải
			root.right=delete(root.right,root.getMaSV());
		}
	return root;
	}
	// gọi pt deleteRec
	void deleteKey(String maSV) {
		root= delete(root,maSV);
	}
	
	}
	
