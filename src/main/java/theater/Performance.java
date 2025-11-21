package theater;

/**
 * Class representing a performance of a play..
 */
public class Performance {

    private final String playID;
    private final int getAudience;

    public Performance(String playID, int audience) {
        this.playID = playID;
        this.getAudience = audience;
    }

    public String getPlayID() {
        return playID;
    }

    public int getAudience() {
        return getAudience;
    }

}
