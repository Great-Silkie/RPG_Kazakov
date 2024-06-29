package characters;

public abstract class Hero implements Mortal {
    private String name;
    protected int damage;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract void attackEnemy(Enemy enemy);

    public void takeDamage(int damage) {
        setHealth(this.health - damage);
    }

    @Override
    public boolean isAlive() {
        return getHealth() > 0;
    }
}
