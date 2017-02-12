package com.javarush.test.myClass;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by sw0rd on 25.09.2016.
 */
public class Bankomat {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new TreeMap<>();
        map.put(2, 5);
        map.put(4,1);
        map.put(7,5);

        int n = 12;
        int k = 3;
        int[] a = {50, 100, 200,500};    //a:array[1..k] of integer=(10,60,100);
        int f[] = new int[n];       // F:array [0..n] of integer;

        f[0]=0;                     //  F[0]:=0;
        for (int m = 1; m <n ; m++) {
            f[m] = 666;
            for (int i = 0; i < k; i++) {
                if(m>=a[i] && f[m-a[i]]+1 < f[m]){
                    f[m]= f[m-a[i]]+1;
                }
            }
        }
        System.out.println(f[120]);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        int m=120;
        if(f[120]==666){
            System.out.println("no possible");
        } else {
            while(m>0){
                for (int i = 0; i < 3; i++) {
                    if(f[m-a[i]] == f[m]-1){
                        System.out.println(a[i]);
                        m-=a[i];
                        break;
                    }
                }
            }
        }

        // something change in this project and i try to commit this version
        /*

 if (F[m]=INF)
  then writeln('нельзя')
  else
    while(m>0) do
        for i:=0 to k do
            if F[m-a[i]]=F[m]-1 then begin
                write(a[i],' ');
                m:=m-a[i];
                break;
            end;
end.

new string
         */
    }
}
