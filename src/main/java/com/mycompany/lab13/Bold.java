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
public class Bold extends Decorator{

    public Bold(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.print(", Bold");
    }

    @Override
    public String line() {
        return String.format(font.line() + ", Bold");
    }
    
}
