package com.mallafre.designpatterns.strategy.adventuregame.characters;

import com.mallafre.designpatterns.strategy.adventuregame.Character;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.SwordBehavior;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.WeaponBehavior;

public class King extends Character {

    public King() {
        this(new SwordBehavior());
    }

    public King(WeaponBehavior weapon) {
        super(weapon);
    }
}
