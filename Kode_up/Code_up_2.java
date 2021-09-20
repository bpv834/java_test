package Kode_up;

import java.util.Scanner;

public class Code_up_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        f(x);
    }
    static int f(int n){
        System.out.println(n);
        if(n!=1)
            return f(n-1);
            else
                return 1;

    }

    public static class Code_up {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            f(n);



        }
      static void f(int n){
            if(n!=1)
                f(n-1);
            System.out.println(n);
      }


    }
}
