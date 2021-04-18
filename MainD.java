import java.util.*;
class MainD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,x=1;
		int sum=1;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			n=cin.nextInt();
			if(n==0)
				break;
			for(int i=1;i<n;i++)
			{
				if(i%3!=0)
				{for(int a=i;a<=i;a++)
				{
					x=x+1;
					sum=sum+x;
				}
				}
				else 
				{for(int b=i;b==i;b++)
				{
					x=x-1;
					sum=sum+x;
				}
				}
			}
			System.out.println(sum);
			sum=1;
			x=1;
		}
		cin.close();
	}

}
