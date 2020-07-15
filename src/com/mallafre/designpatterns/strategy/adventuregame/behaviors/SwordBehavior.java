package com.mallafre.designpatterns.strategy.adventuregame.behaviors;

public class SwordBehavior implements WeaponBehavior{
    @Override
    public void useWeapon() {
        System.out.println("Using a sword!");
    }
}
