import characters.*;

public class TrainingGround {
    public static void main(String[] args) {
//        Hero leon = new Hero("Leon");
        Enemy saruman = new Zombie(10000);
//        leon.attackEnemy(saruman);
        Zombie loser = new Zombie(-1);

        Warrior gimly = new Warrior("Gimly", 300);
//        gimly.attackEnemy(saruman);
//        gimly.shieldUp();
//        System.out.println("Is the Warrior shield up? " + gimly.isShield());
//        saruman.attackHero(gimly);
//        saruman.attackHero(gimly);
//
//        Archer legolas = new Archer("Legolas", 100);
//        legolas.attackEnemy(saruman);
//        legolas.multipleAttack(saruman);
//
//        Mage gendalf  = new Mage("Gendalf", 50);
//        gendalf.attackEnemy(saruman);
//        System.out.println(gendalf.getHealth());
//        gendalf.healing(gendalf);
//        System.out.println(gendalf.getHealth());
//        gendalf.healing(gimly);
//
//        System.out.println(saruman.getHealth());
//        System.out.println("Enemy is alive?");
//        System.out.println(saruman.isAlive());

//        loser.resurrection();
//        loser.resurrection();
//        loser.resurrection();
//        loser.resurrection();

        Shaman shaman = new Shaman(70);
        shaman.spawnZombie();
        shaman.minion_1.attackHero(gimly);
        shaman.spawnZombie();
        shaman.spawnZombie();
        shaman.spawnZombie();

        gimly.attackEnemy(shaman.minion_1);
        System.out.println(shaman.minion_1.getHealth());
    }
}