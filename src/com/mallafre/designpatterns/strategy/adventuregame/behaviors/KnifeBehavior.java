package com.mallafre.designpatterns.strategy.adventuregame.behaviors;

public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Using a knife!");
    }
}
