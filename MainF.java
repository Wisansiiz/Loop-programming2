import java.util.*;
class MainF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i=1;
		double sum=0,max=0,min=1000;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		while(i<=n&&in.hasNext())
		{
			int j=in.nextInt();
			max=Math.max(j, max);
			min=Math.min(j, min);
			sum=sum+j;
			i++;
		}
		sum=(sum-max-min)/(n-2);
		System.out.printf("%.2f",sum);
        in.close();
	}

}
