import java.util.Scanner;

public class Launch6 {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		int [][][] ar=new int[2][3][3];
		for (int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.println("Enter the marks of college"+i+"class"+j+"Students"+k);
					ar[i][j][k]=scan.nextInt();
				}
			}
		}
		System.out.println("Marks stored are as follows");
		for (int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar[i].length;j++)
			{
				for(int k=0;k<ar[i][j].length;k++)
				{
					System.out.print(ar[i][j][k]+ " ");
				}
				System.out.println();
			}
		}
		
				}
			}
	

	


