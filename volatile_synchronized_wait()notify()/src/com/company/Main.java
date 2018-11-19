package com.company;

public class Main {

    public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
	// write your code here
        // volatile
        // synchronized
        // wait()/notify()
        Cake test_cake = new Cake("Donut Sugar Free",300,10,15.5f);
        System.out.println(test_cake);


        CakeFactory.generate_cakes(5);
        CakeFactory.showCakes();
        System.out.println("*************** Im buy");
        CakeStore.getCakes(5);
        System.out.println("*************** Set to null and sout");
        CakeFactory.showCakes();
    }
}
//Producer -> Resource -> Consumer
// Сделать 2 метода
