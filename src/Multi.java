import java.util.Scanner;
public class Multi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
System.out.println("Two numbers to multiply ");
	int a=scan.nextInt();
	int b=scan.nextInt();
	
	int num;
	int multiple=Modify(a,b);
	System.out.println(multiple);
	}
	public static int Modify(int a, int b)
	{
		int multiple= (a*b);
		return multiple;
	}
}
