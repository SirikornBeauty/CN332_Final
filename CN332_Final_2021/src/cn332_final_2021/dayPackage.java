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
public class dayPackage implements Strategy{

    @Override
    public int doPackage(int price, int people, int day) {
        if(day  >= 3){
            price = price - 1500;
            return price;
        }
        else {
            return price;
        }
    }
    
}
