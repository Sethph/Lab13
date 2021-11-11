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
public class Strikethrough extends Decorator {

    public Strikethrough(Font font) {
        super(font);
    }

    @Override
    public void print() {
        font.print();
        System.out.print(", Strinkthrough");
    }

    @Override
    public String line() {
        return String.format(font.line() + ", Strikethrough");
    }

}
