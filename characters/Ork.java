package characters;

public class Ork extends Enemy{
    public Ork(int health) {
        super(health);
        damage = 30;
        name = "Ork";
    }

    public void rage() {
        damage += 10;
    }

    @Override
    public void attackHero(Hero hero) {
        hero.takeDamage(damage);
        System.out.printf("Hero %s is attacked back from the Ork\n", hero.getName());
    }

    @Override
    public void attackHero(Warrior warrior) {
        if (warrior.isShield()) {
            warrior.setShield(false);
            System.out.printf("%s defended himself with a shield\n", warrior.getName());
        }
        else {
            warrior.takeDamage(damage);
            System.out.printf("Hero %s is attacked back from the Ork\n", warrior.getName());
        }
    }
}
