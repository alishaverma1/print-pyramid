import java.util.Scanner;

public class Assignment4 
{
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the height of the pyramid.");
	int height = scan.nextInt();
	
	if(height<1 || height>25)
	{
		while(height<1 || height>25)
		{
			System.out.println("Please enter a valid height: ");
			height = scan.nextInt();
		}
	}
	System.out.println("Would you like a diamond instead of a pyramid?");
	String ans = scan.next();
	ans = ans.toLowerCase();
	if(!(ans.equals("yes")&&!(ans.equals("no"))))
	{
		while(!(ans.equals("yes"))&&!(ans.equals("no")))
		{
			System.out.println("Would you like a diamond instead of a pyramid?");
			ans = scan.next();
			ans = ans.toLowerCase();
		}
	}
	boolean pyr = false;
	if(ans.equals("yes"))
	{
		pyr = true;
	}
	if(pyr==true)
	{
		System.out.println("The program will print a diamond instead");
	}
	else
	{
		System.out.println("The program will print a pyramid");
	}
	
	for(int i = 1; i<=height; i++)
	{
			for(int z = height-1; z>=i; z--) 
			{
				System.out.print(" ");
			}
			for(int j = 1; j<=(i*2)-1; j++)
			{
				System.out.print("*");
			}
			System.out.println();
	}
	if(pyr)
	{
		for(int i = height-1; i>=0; i--)
		{
			for(int z = i; z<=height-1; z++)
			{
				System.out.print(" ");
			}
			for(int j = (i*2)-1; j>=1; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
}
