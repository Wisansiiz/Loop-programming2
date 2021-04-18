import java.util.*;
class MainJ {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int x;
        for(int i=10;i<=99;i++){
            for(int a=1;a<=9;a++){
                for(int b=0;b<=9;b++){
                    x=a*1000+a*100+b*10+b;
                    if(i*i==x)
                    System.out.print(x);
                }
            }
 
        }
 
    }
 
}
