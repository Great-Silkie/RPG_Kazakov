package characters;

public abstract class Enemy implements Mortal {
    protected String name;
    private int health;
    protected int damage;

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

    public abstract void attackHero(Hero hero);

    public abstract void attackHero(Warrior warrior);

    public String getName() {
        return name;
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
