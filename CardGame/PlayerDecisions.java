package CardGame;

public enum PlayerDecisions {
    HIT("Hit"),
    STAND("Stand"),
    DOUBLE_DOWN("Double Down"),
    SPLIT("Split");

    private String value;

    public String getValue() {
        return value;
    }

    private PlayerDecisions(String value) {
        this.value = value;
    }

}