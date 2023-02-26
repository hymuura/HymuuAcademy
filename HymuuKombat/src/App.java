public class App {
    public static void main(String args[]) {
        Fighter boxer = new Boxer("Maywada");
        Fighter kungFuKid = new KungFuKid("Carusso");
        Fighter streetRager = new StreetRager("tommyGun");

        Stage stage = new Stage(streetRager, boxer);

        stage.presentation();
        stage.start();
    }
}
