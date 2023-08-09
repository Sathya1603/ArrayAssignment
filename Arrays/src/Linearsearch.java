import java.util.Scanner;

public class Linearsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] ar= {10,20,40,50,30,60,70,90};
		boolean flag=false;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter key to be searched");
		int key=scan.nextInt();
		for(int i=0;i<ar.length;i++)
		{
			if(key==ar[i])
			{
				System.out.println("Key"+key+ " Found at index "+i);
				flag=true;
				break;
				
				
			}
		}
		if(flag==false)
		{
		System.out.println("Key not found");
		}

	}

}
