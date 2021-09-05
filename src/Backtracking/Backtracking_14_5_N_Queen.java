package Backtracking;

import java.util.Scanner;

public class Backtracking_14_5_N_Queen {
    public static  int arr[];
    public static  int n;
    public static  int cnt=0;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        arr=new int[n];

        nQueen(0);
        System.out.println(cnt);
    }

    public  static  void nQueen(int depth){
        if(depth==n) {
            cnt++;
            return;
        }
        for (int i=0;i<n;i++){
            arr[depth]=i;
            if(Possiblillity(depth)){
                nQueen(depth+1);
            }
        }
    }

    public  static  boolean Possiblillity(int col) {
        for (int i = 0; i < col; i++) {
            if (arr[col] == arr[i]) {
                return false;
            } else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) {
                return false;
            }
        }
        return true;
    }
    }





