package CodeForcesContest;

import java.util.Scanner;

public class KingKeykhosrowMystery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t--!=0){
            int a =sc.nextInt();
            int b =sc.nextInt();
            int m = Math.min(a,b);
            while(m>0){
                if(m>=a||m>=b){
                    int rem1 =m%a;
                    int rem2 =m%b;
                    if(rem1==rem2){
                        System.out.println(m);
                        break;
                    }else{
                        m++;
                    }
                }
            }



        }

    }
}
