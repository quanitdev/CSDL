package Stack_Queue;

public class MainStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack obj=new Stack();
		obj.inti();
		obj.push(7);
		obj.push(5);
		obj.push(3);
		System.out.print(obj.pop()+";"+obj.pop()+";"+obj.pop());
	}

}
