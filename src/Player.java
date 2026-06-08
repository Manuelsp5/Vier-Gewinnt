public class Player {
    private String name;
    private int wins = 0;
    private int losses = 0;
    private int draws = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWins() {
        return wins;
    }

    public int getLosses() {
        return losses;
    }

    public int getDraws() {
        return draws;
    }

    public void addWins() { wins++; }

    public void addLosses() { losses++; }

    @Override
    public String toString() {
        return name + " | Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws;
    }

}

