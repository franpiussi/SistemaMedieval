package models;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import strategies.move.MoveFly;

public class Wizard extends Character {

    public Wizard(String name, IMove move, IAttack attack, IDefense defense) {
        super(name, move, attack, defense);
    }
}
