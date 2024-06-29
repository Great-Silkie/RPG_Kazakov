package characters;

import characters.Enemy;
import characters.Hero;

public class Mage extends Hero {
    public Mage(String name, int health) {
        super(name, health);
        damage = 50;
    }

    public void healing(Hero hero) {
        hero.setHealth(hero.getHealth() + 50);
        System.out.printf("%s healing %s\n", super.getName(), hero.getName());
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.printf("Mage %s attacks %s\n", super.getName(), enemy.getName());
    }
}
