package com.mallafre.designpatterns.strategy.adventuregame.characters;

import com.mallafre.designpatterns.strategy.adventuregame.Character;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.KnifeBehavior;
import com.mallafre.designpatterns.strategy.adventuregame.behaviors.WeaponBehavior;

public class Troll extends Character {

    public Troll() {
        this(new KnifeBehavior());
    }

    public Troll(WeaponBehavior weapon) {
        super(weapon);
    }
}
