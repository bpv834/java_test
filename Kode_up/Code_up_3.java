package Kode_up;

import java.util.Scanner;

public class Code_up_3 {
   static Scanner sc=new Scanner(System.in);
  static   int n=sc.nextInt();
    static int m=sc.nextInt();
   static void f(int n){
       if(n%2!=0)
           System.out.println(n);
        if(n<=m)
            f(n+1);


    }

    public static void main(String[] args) {


        f(n);
    }
}
