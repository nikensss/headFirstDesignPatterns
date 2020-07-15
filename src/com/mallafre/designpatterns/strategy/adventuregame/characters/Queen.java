package com.mallafre.designpatterns.strategy.adventuregame.characters;

import com.mallafre.designpatterns.strategy.adventuregame.Character;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.AxeBehavior;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.WeaponBehavior;

public class Queen extends Character {

    public Queen() {
        this(new AxeBehavior());
    }

    public Queen(WeaponBehavior weapon) {
        super(weapon);
    }
}
