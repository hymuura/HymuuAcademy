public class StreetRager extends Fighter {
    public StreetRager(String name) {
        super(name, 150L, 7L, 5L, 6L, 10L);
    }

    @Override
    public void attack(Fighter target) {
        Long damage = this.attack * 2 + this.agility * 3 + this.intelligence * 4;
        if (isAlive()) {
            target.receiveAttack(damage - target.getDefense());
        }
    }

    @Override
    public void combatCry() {
        System.out.println("Soy " + this.name);
        System.out.println("Mira que te como hermano!!!");
    }
}
