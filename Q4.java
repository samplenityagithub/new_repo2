import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		int a,b;
		Scanner s= new Scanner(System.in);
		System.out.println("enter first number");
		a=s.nextInt();
		System.out.println("enter second number");
		b=s.nextInt();

        int sum=a+b;
		System.out.println("sum is "+sum);
		if(sum>100)
		{
			System.out.println("welcome");
		}
		else {
			System.out.println("sorry");
			
		}
	}

}
