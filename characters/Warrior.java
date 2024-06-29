package characters;

import characters.Enemy;
import characters.Hero;

public class Warrior extends Hero {
    private boolean shield = false;
    public Warrior(String name, int health) {
        super(name, health);
        super.damage = 30;
    }

    public void shieldUp() {
        shield = true;
    }

    public boolean isShield() {
        return shield;
    }

    public void setShield(boolean shield) {
        this.shield = shield;
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.printf("Warrior %s attacks the enemy\n", super.getName());
    }
}
