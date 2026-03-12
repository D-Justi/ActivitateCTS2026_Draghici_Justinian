package main;

import acs.cts.singleton.Hotel;

public class Main {
    public static void main(String[] args){
        Hotel hotel1 = Hotel.getInstance("Intercontinental", 7,5);
        Hotel hotel2 = Hotel.getInstance("Mega", 150,0);

        hotel1.rezervareCamera();
        hotel1.rezervareCamera();

        hotel2.rezervareCamera();
        hotel2.rezervareCamera();
    }
}
