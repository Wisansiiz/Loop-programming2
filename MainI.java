import java.util.*;
class MainI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		Scanner in=new Scanner(System.in);
		m=in.nextInt();
		n=in.nextInt();
		for(;m<=n;m++){
			int a=m/100;
			int b=m%100/10;
			int c=m%100%10;
			if(m==a*a*a+b*b*b+c*c*c)
			System.out.println(m);
		}
        in.close();
	}

}
