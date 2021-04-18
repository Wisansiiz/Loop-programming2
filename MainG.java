import java.util.*;
class MainG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a;
		int n;
		long sum=0;
		Scanner in=new Scanner(System.in);
		while(in.hasNext())
		{
			a=in.next();
			n=in.nextInt();
			if(n==0)
			{
				sum=0;
			}
			else
			{
			sum=Integer.parseInt(a);
			int x=Integer.parseInt(a);
			for(int i=1;i<n;i++)
			{
				a=x+a;
				sum=Integer.parseInt(a)+sum;
			}
			}
			System.out.println(sum);
		}
        in.close();
	}

}
