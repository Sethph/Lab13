/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab13;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author sethp
 */
public class DecoratorTest {
    
    @Test
    public void testDecorator1(){
        Decorator font = new Bold(new Underline(new NewTimesRoman(11)));
        String test = font.line();
        assertEquals(test, "New Times Roman, 11, Underline, Bold");
    }

    @Test
    public void testDecorator2(){
        NewTimesRoman font = new NewTimesRoman(11);
        String test = font.line();
        assertEquals(test, "New Times Roman, 11");
    }
    
    @Test
    public void testDecorator3(){
        Decorator font = new Strikethrough(new Italic(new Bold(new Underline(new Calibri(11)))));
        String test = font.line();
        assertEquals(test, "Calibri, 11, Underline, Bold, Italic, Strikethrough");
    }
    
    @Test
    public void testDecorator4(){
        Decorator font = new Bold(new Strikethrough(new Italic(new NewTimesRoman(16))));
        String test = font.line();
        assertEquals(test, "New Times Roman, 16, Italic, Strikethrough, Bold");
    }
    
    @Test
    public void testDecorator5(){
        Decorator font = new Italic(new Strikethrough(new Calibri(27)));
        String test = font.line();
        assertEquals(test, "Calibri, 27, Strikethrough, Italic");
    } 
    
}
