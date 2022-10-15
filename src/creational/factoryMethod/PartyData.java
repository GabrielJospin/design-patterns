package creational.factoryMethod;

public class PartyData {
    private int id;
    private long duration;
    private String winner;
    private String player1;
    private String player2;
    private int pointsPlayer1;
    private int pointsPlayer2;

    public PartyData() {}

    public PartyData(int id, long duration, String winner, String player1, String player2, int pointsPlayer1, int pointsPlayer2) {
        this.id = id;
        this.duration = duration;
        this.winner = winner;
        this.player1 = player1;
        this.player2 = player2;
        this.pointsPlayer1 = pointsPlayer1;
        this.pointsPlayer2 = pointsPlayer2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getDuration() {
        return duration;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getPlayer1() {
        return player1;
    }

    public void setPlayer1(String player1) {
        this.player1 = player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public void setPlayer2(String player2) {
        this.player2 = player2;
    }

    public int getPointsPlayer1() {
        return pointsPlayer1;
    }

    public void setPointsPlayer1(int pointsPlayer1) {
        this.pointsPlayer1 = pointsPlayer1;
    }

    public int getPointsPlayer2() {
        return pointsPlayer2;
    }

    public void setPointsPlayer2(int pointsPlayer2) {
        this.pointsPlayer2 = pointsPlayer2;
    }

    @Override
    public String toString() {
        return "PartyData{" +
                "id=" + id +
                ", duration=" + duration +
                ", winner='" + winner + '\'' +
                ", player1='" + player1 + '\'' +
                ", player2='" + player2 + '\'' +
                ", pointsPlayer1=" + pointsPlayer1 +
                ", pointsPlayer2=" + pointsPlayer2 +
                '}';
    }

}
