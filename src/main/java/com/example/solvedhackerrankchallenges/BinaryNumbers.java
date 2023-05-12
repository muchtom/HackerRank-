package com.example.solvedhackerrankchallenges;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class BinaryNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        bufferedReader.close();
        Set<Integer> counts = new HashSet<>();
        int  count = 0;
        while(n>0){
            if(n % 2 !=0){
                count++;
            }
            else{
                counts.add(count);
                count = 0;
            }
            n = n/2;
            if(n ==0){
                counts.add(count);
            }
        }
        System.out.println(Collections.max(counts));

    }
}
