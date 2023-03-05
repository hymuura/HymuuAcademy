public class Fighter {
    protected String name;
    protected Long health;
    protected Long attack;
    protected Long defense;
    protected Long agility;
    protected Long intelligence;

    public Fighter(String name, Long health, Long attack, Long defense, Long agility, Long intelligence) {
        this.name = name;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.agility = agility;
        this.intelligence = intelligence;
    }

    public void combatCry() {
        System.out.println("Uhhh Uhhhh Uhhhh!!!");
    }

    public void winnerCry() {
        System.out.println("jo jo jo jo jo!!!");
    }

    public void attack(Fighter target) {
        if (isAlive()) {
            target.receiveAttack(this.attack - target.getDefense());
        }
    }

    public void receiveAttack(Long damage) {
        this.health = this.health - damage;
    }

    public boolean isAlive() {
        if (this.health <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public Long getDefense() {
        return defense;
    }

    public Long getAgility() {
        return agility;
    }

    public String getName() {
        return name;
    }

    public Long getHealth() {
        return health;
    }
}
