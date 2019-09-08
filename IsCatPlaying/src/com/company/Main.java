package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        isCatPlaying(true, 45);
    }
    public static boolean isCatPlaying(boolean summer, int temp){
        if((summer == true) && (temp >=25 && temp <=45)){
            System.out.println("The cat is playing");
            return true;
        }else if((summer == false)&& (temp >= 25 && temp <= 35)){
            System.out.println("The cat is playing");
            return true;
        }else{
            System.out.println("False");
            return false;
        }
    }

}
