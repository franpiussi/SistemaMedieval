import decorators.DA_Defense;
import decorators.IC_Defense;
import decorators.Laser_Attack;
import models.Character;
import models.Warrior;
import strategies.attack.AttackArch;
import strategies.attack.AttackNone;
import strategies.defense.DefenseShield;
import strategies.move.MoveRun;
import strategies.move.MoveWalk;

public class Main {

    public static void main(String[] args) {
        try {
            Character warrior = new Warrior("Lucia", new MoveWalk(), new AttackNone(), new DefenseShield());
            System.out.println(warrior);
            System.out.println(warrior.attack());
            System.out.println(warrior.defense());
            System.out.println(warrior.move());

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }

            warrior = new IC_Defense(warrior);
            System.out.println(warrior.defense());

            warrior = new DA_Defense(warrior);
            System.out.println(warrior.defense());

            warrior = warrior.getCharacter();

            System.out.println(warrior.defense());


           /*try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.getMessage();
            }

            warrior.setAttack(new AttackArch());
            System.out.println(warrior.attack());

            warrior.setMove(new MoveRun());
            System.out.println(warrior.move());

            warrior = new Laser_Attack(warrior);
            System.out.println(warrior.attack());
            */


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
