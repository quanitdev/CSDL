package DOTHI;
import java.util.ArrayList;
public class dothi {
private int numberPoint;
private static int matrix[][];
private static int vs[];
private static int q[];
public dothi() {};
// duyet rong
public static void init ()
{
	for (int i=1; i<9; i++)
		for(int j=1; j<9; j++) {
			matrix[i][j]=0;}
	for(int i=1;i<9;i++)
	{ vs[i]=0;q[i]=0;}
}
public static void add_edge( int i, int j)
{
	matrix[i][j]=1;
	matrix[j][i]=1;
}
public static void hthi()
{
	for(int i=1;i<9;i++) {
		System.out.print(i+": ");
		for(int j=1;j<9;j++) {
			System.out.print(matrix[i][j]+" ");
		}
		System.out.println();
	}
}
public static void sau(int dinh)
{
	int j;
	vs[dinh]=1;
	for(j=1;j<9;j++)
		if((matrix[dinh][j]==1)&&(vs[j]==0)){
			System.out.print(j+"-->");
			sau(j);
		}
}
public static void rong (int dinh) {
	int x, i,j,s;
	vs[dinh]=1;
	i=1;
	q[i]=dinh; s=1;
	while(s>=i)
	{
	dinh=q[i];i++;
	for(j=1;j<9;j++)
		if(matrix[dinh][j]==1&&(vs[j]==0)) {
			System.out.print(j+"-->");s++;
			q[s]=j;
			vs[j]=1;
		}
	}
}

public static void main(String[] args)
{
	matrix=new int[10][10];
	vs=new int[10];
	q=new int[10];
	int i;
	init();
	add_edge(1,2);
	add_edge(1,6);
	add_edge(2,3);
	add_edge(2,4);
	add_edge(2,6);
	add_edge(2,8);
	add_edge(6,7);
	add_edge(7,5);
	add_edge(7,8);
	
	hthi();
	sau(1);
}
}
