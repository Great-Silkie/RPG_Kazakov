package characters;

public class Shaman extends Enemy{
    private static int counter = 0;
    public Zombie minion_1;
    public Zombie minion_2;
    public Zombie minion_3;
    public Shaman(int health) {
        super(health);
        damage = 0;
        name = "Zombie";
    }

    public void spawnZombie() {
        System.out.println("Shaman are spawning a Zombie");
        switch (counter) {
            case 0:
                minion_1 = new Zombie(30);
                counter++;
                System.out.println("Minion_1 is alive");
                break;
            case 1:
                minion_2 = new Zombie(30);
                counter++;
                System.out.println("Minion_2 is alive");
                break;
            case 2:
                minion_3 = new Zombie(30);
                counter++;
                System.out.println("Minion_3 is alive");
                break;
            default:
                System.out.println("Enough zombies for this Shaman");
                break;
        }
    }

    @Override
    public void attackHero(Hero hero) {
        System.out.println("Shaman does not attack");
    }

    @Override
    public void attackHero(Warrior warrior) {
        System.out.println("Shaman does not attack");
    }
}
