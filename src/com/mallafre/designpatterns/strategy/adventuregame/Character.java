package com.mallafre.designpatterns.strategy.adventuregame;

import com.mallafre.designpatterns.strategy.adventuregame.behaviors.WeaponBehavior;

public abstract class Character {

    WeaponBehavior weapon;

    public Character(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
    }

    public void fight(){
        if(weapon == null){
            return;
        }
        weapon.useWeapon();
    };
}
