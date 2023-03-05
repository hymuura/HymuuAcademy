import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String args[]) {
        Fighter boxer = new Boxer("Maywada");
        Fighter kungFuKid = new KungFuKid("Carusso");
        Fighter streetRager = new StreetRager("tommyGun");

        //Stage stage = new Stage(streetRager, boxer, ArenaEnum.BEACH);

        //stage.presentation();
        //stage.start();

        List<Fighter> fighterList = new ArrayList<>();
        fighterList.add(new Boxer("p1"));
        fighterList.add(new Boxer("p2"));
        fighterList.add(new Boxer("p3"));
        fighterList.add(new Boxer("p4"));
        fighterList.add(new Boxer("p5"));
        fighterList.add(new Boxer("p6"));
        fighterList.add(new Boxer("p7"));
        fighterList.add(new Boxer("p8"));


        Tournament t1 = new Tournament(fighterList);

        t1.start();
    }
}
