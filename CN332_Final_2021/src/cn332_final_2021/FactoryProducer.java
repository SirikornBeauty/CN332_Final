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
public class FactoryProducer {
    public static LoginAbstractFactory getLoginFactory(boolean social){
        if(social){
            return new SocialLoginFactory();         
        }
        else{
            return new LoginFactory();
        }
    }
    
    public static RoomAbstractFactory getRoomFactory(){
        return new RoomFactory();
    }
}
