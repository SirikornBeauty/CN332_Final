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
public class LoginFactory extends LoginAbstractFactory{

    @Override
    Login getLogin(String loginType) {
        if(loginType.equalsIgnoreCase("APP")){
            return new AppLogin();
        }         
      return null;
    }

}
