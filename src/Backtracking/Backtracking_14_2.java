package Backtracking;

import java.util.Scanner;

public class Backtracking_14_2 {
    static int arr[];
    static int N,M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        arr = new int[M];
        dfs(1, 0);
    }
    public static void dfs(int p, int depth){
        if(depth == M){

            for(int var: arr) {
                System.out.print(var + " ");
            }
            System.out.println("4p = " + p + ", depth = " + depth);
            System.out.println();
            return;
        }


        for(int i=p; i<=N; i++){
            System.out.println("2p = " + p + ", depth = " + depth);
            arr[depth] = i;
            dfs(i+1,depth+1);
            System.out.println("3p = " + p + ", depth = " + depth);
        }
        System.out.println("3p = " + p + ", depth = " + depth);
    }
}