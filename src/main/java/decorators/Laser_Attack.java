package decorators;

import interfaces.IAttack;
import interfaces.IDefense;
import interfaces.IMove;
import models.Character;

public class Laser_Attack extends CharacterDecorator {

    public Laser_Attack(Character character) {
        super(character, character.getName(),character.getMove(),character.getAttack(),character.getDefense());
    }

    public String attack(){
        return this.character.getAttack().attack() + " | I'm attacking with a Laser Weapon";
    }
}
