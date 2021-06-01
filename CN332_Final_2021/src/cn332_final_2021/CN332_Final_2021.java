/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn332_final_2021;

import java.util.Scanner;

/**
 *
 * @author sirik
 */
public class CN332_Final_2021 {

    /**
     * @param args the command line arguments
     */
    public static int packageRoom(int price) {
        System.out.println("----------------------------------------------------");
        System.out.println("How many peoples?");  
        System.out.println("(1) 1 people");  
        System.out.println("(2) 2 peoples"); 
        System.out.println("(3) 3 peoples");
        System.out.println("(4) 4 peoples"); 
        
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter your choice: ");  
        String num = sc.next();
        
        System.out.println("----------------------------------------------------");

        Scanner sc1 = new Scanner(System.in);  
        System.out.print("How many days?: ");  
        String numDay = sc1.next();
        
        int people = Integer.parseInt(num);
        int day = Integer.parseInt(numDay);
        price = price * day;
        
        if(people > 1 && 5 > people) {
            System.out.println("----------------------------------------------------");
            System.out.println("Want People Package?");  
            System.out.println("(1) Yes");  
            System.out.println("(2) No"); 

            Scanner sc2 = new Scanner(System.in);  
            System.out.print("Enter your Package: ");  
            String p = sc2.next();
            
            if(p.equals("1")) {
                System.out.println("Get People Package."); 
                Context context = new Context(new PeoplePackage());
                price =  context.executeStrategy(price, people, day);
            }
            else {
                System.out.println("No People Package."); 
            }
        }
        
        if(day > 2) {
            System.out.println("----------------------------------------------------");
            System.out.println("Want Day Package?");  
            System.out.println("(1) Yes");  
            System.out.println("(2) No"); 

            Scanner sc2 = new Scanner(System.in);  
            System.out.print("Enter your Package: ");  
            String p = sc2.next();
            
            if(p.equals("1")) {
                System.out.println("Get Day Package."); 
                Context context = new Context(new dayPackage());
                price =  context.executeStrategy(price, people, day);
            }
            else {
                System.out.println("No Day Package."); 
            }
        }
        return price;
    }
    
    public static int bookRoom() {
        System.out.println("----------------------------------------------------");
        System.out.println("Room type");  
        System.out.println("(1) Single bed room");  
        System.out.println("(2) Double bed room"); 
        
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter your room type: ");  
        String rType = sc.next();
        
        System.out.println("----------------------------------------------------");
        System.out.println("Want Wifi?");  
        System.out.println("(1) Yes");  
        System.out.println("(2) No"); 
        
        Scanner sc1 = new Scanner(System.in);  
        System.out.print("Enter your room type: ");  
        String wType = sc1.next();
        
        boolean wifi = false;
        int price = 0;
        RoomAbstractFactory roomFactory = FactoryProducer.getRoomFactory();
        
        if(wType.equals("1")) {
            wifi = true;
        }
        else if(wType.equals("2")) {
            wifi = false;
        }
        else {
            System.out.println("Error Wifi!!!"); 
        }
        
        System.out.println("----------------------------------------------------");
        
        if(rType.equals("1")) {
            Room room = roomFactory.getRoom("SINGLE");
            room.book(wifi);
            price = room.priceRoom();
        }
        else if(rType.equals("2")) {
            Room room = roomFactory.getRoom("DOUBLE");
            room.book(wifi);
            price = room.priceRoom();
        }
        else {
            System.out.println("Error book a room!!!"); 
        }
        return price;
    }
    
    public static void main(String[] args) {
        
        System.out.println("----------------------------------------------------");
        System.out.println("Account type");  
        System.out.println("(1) Social account");  
        System.out.println("(2) Application account"); 
        
        Scanner sc= new Scanner(System.in);  
        System.out.print("Enter your account type: ");  
        String accType = sc.next();
        
        
        if(accType.equals("1")) {
            LoginAbstractFactory loginFactory = FactoryProducer.getLoginFactory(true);
            
            System.out.println("----------------------------------------------------");
            System.out.println("Social type");  
            System.out.println("(1) Facebook account");  
            System.out.println("(2) Google account");
            
            Scanner sc1= new Scanner(System.in);  
            System.out.print("Enter your social type: ");  
            String socialType = sc1.next();
            
            if(socialType.equals("1")) {
                Login login = loginFactory.getLogin("FACEBOOK");
                login.signIn();
                
                int roomPrice = bookRoom();
                int price = packageRoom(roomPrice);
                System.out.println("----------------------------------------------------");
                System.out.println("Room price: " + String.valueOf(price) + " Bath.");
            }
            else if(socialType.equals("2")) {
                Login login = loginFactory.getLogin("GOOGLE");
                login.signIn();
                
                int roomPrice = bookRoom();
                int price = packageRoom(roomPrice);
                System.out.println("----------------------------------------------------");
                System.out.println("Room price: " + String.valueOf(price) + " Bath.");
            }
            else {
                System.out.println("Error social type!!!");
            }
            
        }
        else if(accType.equals("2")) {
            System.out.println("----------------------------------------------------");
            
            LoginAbstractFactory loginFactory = FactoryProducer.getLoginFactory(false);
            Login login = loginFactory.getLogin("APP");
            login.signIn();
            
            int roomPrice = bookRoom();
            int price = packageRoom(roomPrice);
            System.out.println("----------------------------------------------------");
            System.out.println("Room price: " + String.valueOf(price) + " Bath.");
        }
        else {
            System.out.println("Error account type!!!");
        }
        System.out.println("----------------------------------------------------");
    }
    
}
