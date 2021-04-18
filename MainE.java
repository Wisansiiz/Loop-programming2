import java.util.*;
class MainE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in=new Scanner(System.in);
			n=in.nextInt();
			int a=0;
			if(n==1)
			{
				a=0;
				System.out.println("not prime");
			}
			else
			{
			for(int l=2;l<=n/2;l++)
			{
				if(n%l==0)a++;//a不等于0，不为质数
			}
			if(a==0)System.out.println("prime");
			else System.out.println("not prime");
			}
		in.close();
	}

}
