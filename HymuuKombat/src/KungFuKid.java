public class KungFuKid extends Fighter{
    public KungFuKid(String name){
        super(name, 100L, 3L, 10L, 8L, 6L);
    }

    @Override
    public void attack(Fighter target) {
        Long damage = this.attack * 1 + this.agility * 5 + this.intelligence * 2;
        target.receiveAttack(damage - target.getDefense());
    }

    @Override
    public void combatCry(){
        System.out.println("Soy " + this.name);
        System.out.println("Ooooooaaaaaaaaaaaaaaaaaoooooohhhh!!!");
    }
}
