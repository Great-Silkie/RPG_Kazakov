package characters;

public class Zombie extends Enemy{
    public Zombie(int health) {
        super(health);
        damage = 10;
        name = "Zombie";
    }

    public void resurrection() {
        if (!super.isAlive()) {
            if (Math.random() > 0.5) {
                setHealth(30);
                System.out.println("The Zombie has risen from the dead");
            }
            else {
                System.out.println("Zombie is finally dead");
            }
        }
        else {
            System.out.println("Can't resurrection alive Zombie");
        }
    }
    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.printf("Hero %s is attacked back from the Zombie\n", hero.getName());
    }

    @Override
    public void attackHero(Warrior warrior) {
        if (warrior.isShield()) {
            warrior.setShield(false);
            System.out.printf("%s defended himself with a shield\n", warrior.getName());
        }
        else {
            warrior.takeDamage(damage);
            System.out.printf("Hero %s is attacked back from the Zombie\n", warrior.getName());
        }
    }
}
