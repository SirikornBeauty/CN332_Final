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
public class RoomFactory extends RoomAbstractFactory{

    @Override
    Room getRoom(String roomType) {
        if(roomType.equalsIgnoreCase("SINGLE")){
            return new SingleBedRoom();
        } 
        else if(roomType.equalsIgnoreCase("DOUBLE")){
            return new DoubleBedRoom();
        }         
      return null;
    }
    
}
