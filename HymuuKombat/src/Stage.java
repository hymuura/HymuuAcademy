public class Stage {
    private Fighter playerOne;
    private Fighter playerTwo;
    private ArenaEnum arena;

    public Stage(Fighter playerOne, Fighter playerTwo, ArenaEnum arena) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        this.arena = arena;
    }

    public void presentation() {
        System.out.println("Hajimeeee!");
        System.out.println(this.arena);
        playerOne.combatCry();
        playerTwo.combatCry();
    }

    public void start() {
        System.out.println("*************************************************************************");
        for (int x = 0; x < 10; x++) {
            System.out.println("Round: " + (x + 1));
            if (playerOne.getAgility().compareTo(playerTwo.getAgility()) < 0) {
                playerTwo.attack(playerOne);
                playerOne.attack(playerTwo);
            } else {
                playerOne.attack(playerTwo);
                playerTwo.attack(playerOne);
            }

            System.out.println(playerOne.getName() + ": " + playerOne.getHealth());
            System.out.println(playerTwo.getName() + ": " + playerTwo.getHealth());

            if (!playerOne.isAlive()) {
                break;
            }

            if (!playerTwo.isAlive()) {
                break;
            }
        }
        System.out.println("*************************************************************************");
        this.winnerPresentation();
    }

    public void winnerPresentation() {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        if (playerOne.isAlive()) {
            System.out.println(playerOne.getName());
            playerOne.winnerCry();
        } else {
            System.out.println(playerTwo.getName());
            playerTwo.winnerCry();
        }
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public Fighter getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(Fighter playerOne) {
        this.playerOne = playerOne;
    }

    public Fighter getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(Fighter playerTwo) {
        this.playerTwo = playerTwo;
    }

    public Fighter getWinner() {
        if (playerOne.isAlive()) {
            return playerOne;
        } else {
            return playerTwo;
        }
    }
}
