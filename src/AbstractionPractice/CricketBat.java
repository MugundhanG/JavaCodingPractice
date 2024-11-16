package AbstractionPractice;

public class CricketBat extends Bat {
    String batName;

    public CricketBat(String batName) {
        this.batName = batName;
    }

    @Override
    public String sportsBat() {
        return batName;
    };

}
