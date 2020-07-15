package com.mallafre.designpatterns.strategy.adventuregame.behaviors;

public class AxeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using an axe!");
    }
}
