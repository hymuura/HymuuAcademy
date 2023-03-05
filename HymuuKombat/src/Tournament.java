import java.awt.geom.Area;
import java.util.List;

public class Tournament {
    private List<Fighter> fighters;
    private Stage arena;

    public Tournament(List<Fighter> fighters) {
        this.fighters = fighters;
    }

    //haga 1 ronda y me de los ganadores de esa ronda

    public void start() {
        Stage stage1 = new Stage(fighters.get(0), fighters.get(1), ArenaEnum.BEACH);
        Stage stage2 = new Stage(fighters.get(2), fighters.get(3), ArenaEnum.BEACH);
        Stage stage3 = new Stage(fighters.get(4), fighters.get(5), ArenaEnum.BEACH);
        Stage stage4 = new Stage(fighters.get(6), fighters.get(7), ArenaEnum.BEACH);

        stage1.start();
        stage2.start();
        stage3.start();
        stage4.start();

        Stage stage5 = new Stage(stage1.getWinner(), stage2.getWinner(), ArenaEnum.BEACH);
        Stage stage6 = new Stage(stage3.getWinner(), stage4.getWinner(), ArenaEnum.BEACH);

        stage5.start();
        stage6.start();

        Stage finalStage = new Stage(stage5.getWinner(), stage6.getWinner(), ArenaEnum.BEACH);

        finalStage.start();
    }
}
