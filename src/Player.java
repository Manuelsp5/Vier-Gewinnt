public class Player {
    private String name;
    private int wins;
    private int losses;
    private int draws;

    public Player(String name, int wins, int losses, int draws) {
        this.name = name;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
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

