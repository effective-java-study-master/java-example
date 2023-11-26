package assignment.ch06.sub37;

public class Lotto {

    public Rank rank;

    public Lotto(Rank rank) {
        this.rank = rank;
    }

    public Rank getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return "Lotto{" +
                "rank=" + rank +
                '}';
    }
}