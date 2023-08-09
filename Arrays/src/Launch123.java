
public class Launch123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//write a program to get min and max elem in an array
		int[] ar= {25,30,60,50,55};
		int max=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]>max)
			{
				max=ar[i];
				
			}
		}
		System.out.println("The max value is "+max);
		 
		int min=ar[0];
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]<min)
			{
				min=ar[i];
				
			}
		}
		System.out.println("The min value is "+min);
			
	}

}
