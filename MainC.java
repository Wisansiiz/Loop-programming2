import java.util.*;
class MainC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;//ÊäÈëµÄÊı
		int i=1;
		Scanner cin=new Scanner(System.in);
		while(cin.hasNext())
		{
			n=cin.nextInt();
		for(i=1;i<=n;i++)
		{
		    for(int a=1;a<=(n-i)*2;a++)
		    {
		    	System.out.print(" ");
		    }
		    for(int b=1;b<=(i-1)*4+1;b++)
		    {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
		for(i=n-1;i>=1;i--)
		{
		    for(int a=1;a<=(n-i)*2;a++)
		    {
		    	System.out.print(" ");
		    }
		    for(int b=1;b<=(i-1)*4+1;b++)
		    {
		    	System.out.print("*");
		    }
		    System.out.println();
		}
		}
		cin.close();
	}

}
