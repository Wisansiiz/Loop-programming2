import java.util.*;
class MainA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;     //质数的个数
		int a=0;       //判断是否为质数
		int n;         //从2到n的数
		int i=2,l=2;   //从2开始
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		while(i<=n){
			for(l=2;l<=i/2;l++){
				if(i%l==0)a++;//a不等于0，不为质数
			}
			i++;
			if(a==0)sum++;
			else sum+=0;
			a=0;       //将a重置为0
		}
        cin.close();
        System.out.println(sum);
	}

}
