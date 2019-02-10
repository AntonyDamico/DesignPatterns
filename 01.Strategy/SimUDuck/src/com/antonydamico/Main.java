package com.antonydamico;

import com.antonydamico.duck.DecoyDuck;
import com.antonydamico.duck.Duck;
import com.antonydamico.fligth.FlyRocketPowered;

public class Main {
    public static void main(String[] args) {
        Duck duck = new DecoyDuck();
        duck.display();
        duck.performQuack();
        duck.performFly();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
