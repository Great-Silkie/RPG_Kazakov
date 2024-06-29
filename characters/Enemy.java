package characters;

import characters.Hero;

public class Enemy implements Mortal {
    private int health;
    private int damage = 10;

    public Enemy(int health) {
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        setHealth(this.health - damage);
    }

    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.printf("Hero %s is attacked back from the enemy\n", hero.getName());
    }

    public void attackHero(Warrior warrior) {
        if (warrior.isShield()) {
            warrior.setShield(false);
            System.out.printf("%s defended himself with a shield\n", warrior.getName());
        }
        else {
            warrior.takeDamage(damage);
            System.out.printf("Hero %s is attacked back from the enemy\n", warrior.getName());
        }
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
