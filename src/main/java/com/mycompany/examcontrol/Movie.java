/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examcontrol;

/**
 *
 * @author sablu
 */
public class Movie {
    private String name;
    private int rating;
    
    public Movie (String title, int rating){
        this.name = title;
        this.rating = rating;
    }
    
    public void watch(){
        System.out.println("Name: " + name + ", Rating: " + rating);
    }
    
}
