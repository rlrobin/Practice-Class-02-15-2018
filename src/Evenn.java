import java.util.Scanner;
public class Evenn {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("What number would you like to check? ");
	int num=scan.nextInt();
	
	String a = check(num);
	
	System.out.println(a);
	}
	
	
	
	public static String check(int num)
	{
		
		if (num%2==0)
	{
		return "true";
	}
	else
	{
		return "false";
	}
	}
}
