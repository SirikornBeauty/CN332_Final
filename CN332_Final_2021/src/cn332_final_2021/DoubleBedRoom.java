/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn332_final_2021;

/**
 *
 * @author sirik
 */
public class DoubleBedRoom implements Room{
    
    private int priceR = 8000;

    @Override
    public void book(boolean wifi) {
 
        if(wifi) {
            System.out.println("Book a double bed room with Wifi.");
            priceR = priceR + 500;
        }
        else {
            System.out.println("Book a double bed room without Wifi.");
        }
    }

    @Override
    public int priceRoom() {
        System.out.println("Double bed room: " + String.valueOf(priceR) + " Bath.");
        return priceR;
    }
    
}
