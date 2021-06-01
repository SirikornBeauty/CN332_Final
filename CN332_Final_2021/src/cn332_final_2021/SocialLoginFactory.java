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
public class SocialLoginFactory extends LoginAbstractFactory{

    @Override
    Login getLogin(String loginType) {
        if(loginType.equalsIgnoreCase("FACEBOOK")){
            return new FacebookLogin();
        }       
        else if(loginType.equalsIgnoreCase("GOOGLE")){
            return new GoogleLogin();
        }       
      return null;
    }

}
