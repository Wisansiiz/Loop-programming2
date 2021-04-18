import java.util.*;
class MainH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		for(int i=1;i<=n;i++)
		{
		if(i==1){for(int a=0;a<=n;a++)
		{
			if(a==0)
			{
				System.out.print("  *");
			}
			else
			{
				System.out.printf("%3s",a);
			}
		}
		System.out.println();
		}
	    
		for(int j=1;j<=i;j++)
		{
			if(j==1)System.out.printf("%3s",i);
			System.out.printf("%3s",j*i);
		}
		System.out.println();
		}
        in.close();
	}

}
