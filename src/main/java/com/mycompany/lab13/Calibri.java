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
public class Calibri implements Font {

    private final int size;
    protected String line;

    public Calibri(int size) {
        this.size = size;
    }

    @Override
    public void print() {
        System.out.print("Calibri, " + size);
    }

    @Override
    public String line() {
        return String.format("Calibri, " + size);
    }

}
