/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shape_rectangle;

/**
 *
 * @author caleb
 */
public class Rectangle extends Shape{
    
    
    private int width;
    private int height;

    public Rectangle() {
        super(50, "RED");
    }
    
    
    
    public void setHeight(int h)
    {
        height = h;
    }
    
    public void setWidth(int width)
    {
        this.width = width;
    }
    
    public void setBrdrWidth(int b)
    {
     
    }
    
}
