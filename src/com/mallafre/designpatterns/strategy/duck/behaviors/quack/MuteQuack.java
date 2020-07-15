package com.mallafre.designpatterns.strategy.duck.behaviors.quack;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<silence>>");
    }
}
