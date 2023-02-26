public class Boxer extends Fighter {
    public Boxer(String name){
        super(name, 200L, 10L, 1L, 3L, 3L);
    }

    @Override
    public void attack(Fighter target) {
        Long damage = this.attack * 3 + this.agility * 2 + this.intelligence * 1;
        target.receiveAttack(damage - target.getDefense());
    }

    @Override
    public void combatCry(){
        System.out.println("Soy " + this.name);
        System.out.println("En el tercero te noqueo, la concha puta de tu madre!!!");
    }
}
