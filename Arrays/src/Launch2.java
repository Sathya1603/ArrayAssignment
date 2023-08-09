import java.util.*;
public class Launch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int[] ar=new int[5];
		for(int i=0;i<ar.length;i++)
		{
			System.out.println("Please enter marks of students" +i );
			ar[i]=scan.nextInt();
			
		}
		System.out.println("The marks of students as follows");
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]+" ");
		
		}

	}

}
