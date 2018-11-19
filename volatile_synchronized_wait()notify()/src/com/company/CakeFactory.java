package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class CakeFactory {
    static String name = "Happiness & Co.";
    static Integer cost = 0;
    static Cake[] cakes = new Cake[20];
    Integer identity = 0;
    public static void generate_cakes(Integer quantity) {

        // cakes = new Cake[quantity];
        if (quantity > checkAvailable()) {
            System.err.println("Too many cakes!!!!");
        } else {
            System.out.println("Cooking " + quantity);
            int start = cakes.length - checkAvailable();
            int stop = start + quantity;
            for (int i = start; i < stop; i++){
                Cake test_cake = new Cake("Donut Sugar Free" + i, 300, 10, 15.5f);
                cakes[i] = test_cake;

            }
        }
    }

    public static Integer checkAvailable() {
        Integer free = 0;
        for (int i = 0; i < cakes.length; i++) {
            if (cakes[i] == null) {
                free++;
            }
        }
        return free;
    }

    public static void showCakes() {
        for (Cake cake : cakes) {
            System.out.println(cake);
        }
    }


}

// method who returns total cost float не выходить за рамки null getTotalCost
// return _> array of cakes getCakes(Integer quantity)  взять с конца столько сколько мы указали в чкобках и создать динамичный массив и его вернуь
// get me 3 выташить с конца и добавить в новый сколько мы заказываем
// temp[] = new Cake[qantity]
// temp[i] = cakes[pos];
// cakes[pos] = null