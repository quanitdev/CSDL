package DSLKDON1;

import java.util.Scanner;

public class LinkList {
	private Link first;
	public LinkList() {
		 first=null;
	}
	public Link insert (String maSV,String hoTen, double diem) {
		Link nut =new Link(maSV, hoTen,diem);
		nut.nextLink=first;
		first=nut;
		return first;
		}
	public void creatList() {
		LinkList list= new LinkList();
		Scanner scanner=new Scanner(System.in);
		while(true)
		{ String maSV="";
		System.out.print("Nhap ma sinh vien:");
		maSV=scanner.nextLine();
		if(maSV.length()==0) {break;}
			else 
			{	//String hoten="";
				System.out.print("Nhap ho ten:");
				String hoten=scanner.nextLine();
				System.out.print("nhap diem:");
				float diem=scanner.nextFloat();
				scanner.nextLine();
				first=list.insert(maSV, hoten, diem);
			}
		}
	}
	public void printList () {
		Link p=first;
		while(p!= null){
			System.out.println(p.getMaSV()+" "+p.getHoTen()+" "+p.getDiem()+" "+p.getKq()+" "+p.getXl());
			p=p.nextLink;
		}
	}
	
	public void printIf () {
		Link p=first;
		while(p!= null){
			if (p.getDiem()>=5)
			System.out.println(p.getMaSV()+" "+p.getHoTen()+" "+p.getDiem()+" ");
			p=p.nextLink;
		}
	}
	
	public void kq () {
		Link p=first;
		while(p!= null){
			if (p.getDiem()>=5)
			p.setKq("Dau");
			else p.setKq("Rot");
			p=p.nextLink;
		}
	}
	
	public void xl () {
		Link p=first;
		while(p!= null){
			if (p.getDiem() < 5)
			p.setXl("Kem");
			else if (p.getDiem() < 7)
				p.setXl("TB");
			else if (p.getDiem() < 8)
				p.setXl("Kha");
			else p.setXl("Gioi");
			p=p.nextLink;
		}
	}
	
	public double  max () {
		Link p=first.nextLink;
		double ln=first.getDiem();
		while(p!= null){
			if (p.getDiem() > ln)
			ln = p.getDiem();
			p=p.nextLink;
		}		
	return ln;
	}
	public Link search (String maSV) {
		Link p=first;
		while ((p!=null)&&(p.getMaSV().equals(maSV)!=true))
		{
			p=p.nextLink;
		}
		return (p);
	}
	
	public void delete (String maSV) {
		Link p= search(maSV);
		if(p!=null) {
			if(p==first) {first=first.nextLink ;;}
			else 
			{ Link q=first;
			while ((q.nextLink!=p)&&(q!=null))
				q=q.nextLink;
			q.nextLink=p.nextLink;
			}
		}
	}
	public void sort() {
		Link p,q;
		String ht, maSV;
		double diem;
		p=first;
		while(p!=null)
		{
			q=p.nextLink;
			while(q!=null) {
				if(p.getHoTen().compareTo(q.getHoTen())>0)
				{ ht=q.getHoTen(); diem=q.getDiem(); maSV=q.getMaSV();
				q.setMaSV(p.getMaSV()); q.setHoTen(p.getHoTen()); q.setDiem(p.getDiem());
				p.setMaSV(maSV);p.setHoTen(ht); p.setDiem(diem);
				}
				q=q.nextLink;
			}
			p=p.nextLink;
		}
		
	}

	public void search1(String hoTen)
	{
		Link p=first;
		while(p!=null)
		{
			if(p.getHoTen().equals(hoTen)==true)
			{
				System.out.print(p.getMaSV()+";"+p.getHoTen());
			}
			p=p.nextLink;
			}
		}
	}
	

	

