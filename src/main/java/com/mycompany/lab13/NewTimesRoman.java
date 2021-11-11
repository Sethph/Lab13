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
public class NewTimesRoman implements Font {

    private final int size;
    protected String line;

    public NewTimesRoman(int size) {
        this.size = size;
    }

    public String getLine() {
        return String.format("New Times Roman, " + size);
    }

    @Override
    public void print() {
        System.out.print("New Times Roman, " + size);
    }

    @Override
    public String line() {
        return String.format("New Times Roman, " + size);
    }

}
