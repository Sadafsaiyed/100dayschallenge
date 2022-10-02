https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true&h_r=next-challenge&h_v=zen


import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int sum =a+b;
            int temp=0;
            for(int j=1;j<=n;j++){
                System.out.print(sum+" ");
                temp =(int)(Math.pow(2,j)*b);
                sum = sum+temp;
            }
            System.out.println();
            sum=0;
        }
        in.close();
    }
}
