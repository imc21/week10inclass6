package com.mycompany.shape_rectangle;


public class Shape
{
    int brdrW;
    String intColor;
    
    
    public Shape(){
        brdrW = 10;
        intColor = "BLUE";
    }
    
    public Shape(int b, String c){
        brdrW = b;
        intColor = c;
    }
    
    public void setBrdrW(int b){
        brdrW = b;
    }
    
    public int getBrdrW(){
        return brdrW;
    }
    
    
}