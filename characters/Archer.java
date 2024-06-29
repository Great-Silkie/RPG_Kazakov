package characters;

public class Archer extends Hero {

    public Archer(String name, int health) {
        super(name, health);
        super.damage = 15;
    }

    public void multipleAttack(Enemy enemy) {
        for (int i = 0; i < 3; i++) {
            attackEnemy(enemy);
        }
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(damage);
        System.out.printf("Archer %s attacks the enemy\n", super.getName());
    }
}
