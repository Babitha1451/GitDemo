

public class Class3 {

	public static void main(int args[]) 
	{
	int a[]=new int[5];
	a[0]=10;
	a[1]=4;
	a[2]=2;
	a[3]=6;
	a[4]=5;
	
	int min=a[0];
	for(int i=0;i<a.length;i++)
	{
		
		if(a[i]<min)
		{
			min=a[i];
		}
		
	}
	System.out.println(min);
		


	}
}
