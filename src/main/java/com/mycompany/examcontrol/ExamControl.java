/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


package com.mycompany.examcontrol;

/**
 *
 * @author sablu
 */
public class ExamControl {
    
    public static void modify(int x){
        x = x*3;
    }
    
    public static int sumToN(int n){
        if (n == 0) return 0;
        else return n* sumToN(n-1);
    }

    public static void main(String[] args) {
        int a = 7;
        double b = 3.0;
        System.out.println(a/b);
        
        Movie ThunderII = new Movie("Thunder 2: Now comes Lightning", 10);
        
       ThunderII.watch();
       
       int number = 4;
       modify(number);
        System.out.println(number);
        
        char[] Hello = {'H', 'E', 'L','L','O'};
        
        System.out.println(Hello[3]+""+Hello[2]);
        
        a = sumToN(3);
        
        System.out.println("a is: " + a);
    }
    
    
}
