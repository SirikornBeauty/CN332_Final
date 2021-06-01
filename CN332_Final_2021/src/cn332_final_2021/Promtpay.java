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
public class Promtpay implements PaymentS{

    @Override
    public void promtpay(String Payname) {
        System.out.println("Pay with Promtpay.");
    }

    @Override
    public void credit(String Payname) {
    }
    
}
