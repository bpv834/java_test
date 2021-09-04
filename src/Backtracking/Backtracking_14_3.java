package Backtracking;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class Backtracking_14_3 {
    public static int arr[];
    public static int n,m;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
       m= sc.nextInt();
      arr=new int[m];
        dfs(1,0);
    }
    public static void dfs(int at, int depth){
        if(m==depth){
            for(int var:arr){
                System.out.print(var+" ");
            }
            System.out.println();
            return;
        }
        for(int i=at;i<=n;i++){
                arr[depth] = i ;
                dfs(i,depth+1);

        }


    }
}
