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
public class PayAdaptor implements Payment{
    PaymentS payments;

    public PayAdaptor(String PayType){

        if(PayType.equalsIgnoreCase("pro") ){
            payments = new Promtpay();			
         
        }
        else if (PayType.equalsIgnoreCase("cre")){
            payments = new Credit();
        }	
    }
    @Override
    public void Pay(String PayType, String Payname) {
        if(PayType.equalsIgnoreCase("pro")){
            payments.promtpay(Payname);
        }
        else if(PayType.equalsIgnoreCase("cre")){
            payments.credit(Payname);
        }
    }
    
}
