package com.mallafre.designpatterns.strategy.adventuregame.characters;

import com.mallafre.designpatterns.strategy.adventuregame.Character;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.BowAndArrowBehavior;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.WeaponBehavior;

public class Knight extends Character {
    public Knight() {
        this(new BowAndArrowBehavior());
    }

    public Knight(WeaponBehavior weapon) {
        super(weapon);
    }
}
