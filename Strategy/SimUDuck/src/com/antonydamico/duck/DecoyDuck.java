package com.antonydamico.duck;

import com.antonydamico.fligth.FlyNoWay;
import com.antonydamico.quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("I'm a decoy duck");
    }
}
