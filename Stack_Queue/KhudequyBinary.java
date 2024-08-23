package Stack_Queue;

public class KhudequyBinary {
	public static void chuyen (int so) {
		Stack obj=new Stack();
		 obj.inti();
		 while (so!=0)
		 {
			 obj.push(so%2);
		//	 System.out.print(so%2);
			 so=so/2;
		 }
		 boolean ok=true;
		 while (ok)
		 {
			 if(obj.top==-1) ok=false;
			 else System.out.print(obj.pop());
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		chuyen(11);
	}
}
