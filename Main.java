package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        // write your code here
    int randomNums[] = new int[10];
    for (int i = 0; i < randomNums.length; i++){
        randomNums[i] = (int) (Math.random()*100);
    }
        System.out.println(Arrays.toString(randomNums));
    int singular = 0, doublee = 0;

    for (int i = 0; i< randomNums.length; i++){
        if(randomNums[i] % 2 == 0){
            doublee++;
        }else{
            singular++;
        }
    }
        System.out.println("Çift: " + doublee + "\nTek: " + singular);
    }
}
