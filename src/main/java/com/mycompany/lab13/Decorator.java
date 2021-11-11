/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;

/**
 *
 * @author sethp
 */
public abstract class Decorator  implements Font{
    protected final Font font;
    
    public Decorator(Font font){
        this.font = font;
    }

    

}
