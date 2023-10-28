package assignment.ch3.sub12;

public class Travel {

    private String departure; //출발지
    private String arrival; //도착지
    private int expense; //비용

    public Travel(String departure, String arrival, int expense) {
        this.departure = departure;
        this.arrival = arrival;
        this.expense = expense;
    }

    @Override
    public String toString() {
        return "{"+departure + ", " + arrival + ", " + expense+"}";
    }

}
