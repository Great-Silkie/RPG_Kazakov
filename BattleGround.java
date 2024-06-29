import characters.*;

public class BattleGround {
    public static void main(String[] args) {
//        Warrior gnom = new Warrior("Gimly", 300);
//        Enemy ork = new Enemy(100);
//
//        battle(gnom, ork);

        Archer elf = new Archer("Legolas", 50);
        Enemy barbarian = new Enemy(100);

        elf.multipleAttack(barbarian);
        battle(elf, barbarian);

    }

    public static void heroAttack(Hero hero, Enemy enemy) {
        hero.attackEnemy(enemy);
        System.out.printf("HP of the Enemy is %d\n", enemy.getHealth());
    }

    public static void enemyGetBack(Enemy enemy, Hero hero) {
        enemy.attackHero(hero);
        System.out.printf("HP of the %s is %d \n", hero.getName(), hero.getHealth());
    }

    public static void battle(Hero hero, Enemy enemy) {
        while (enemy.isAlive() && hero.isAlive()) {
            heroAttack(hero, enemy);
            if (enemy.isAlive()) {
                enemyGetBack(enemy, hero);
            }
        }
        if (!enemy.isAlive()) {
            System.out.println("The Enemy has died");
        }
        else {
            System.out.printf("Hero %s has died\n", hero.getName());
        }
    }
}
