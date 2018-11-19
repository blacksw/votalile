package com.company;
//consumer
public class CakeStore{
    public static void getCakes(Integer getMe){
        Cake[] getCake = new Cake[getMe + 1];
        int count = 0;
        for (int i = getMe - 1; i > 0; i--) {
            if (CakeFactory.cakes[i] != null && count < 3) {
                getCake[i] = CakeFactory.cakes[i];
                CakeFactory.cakes[i] = null;
                CakeFactory.cost += 5;
                count++;
                System.out.println(getCake[i] + "sweet");
            }
        }
    }
}
