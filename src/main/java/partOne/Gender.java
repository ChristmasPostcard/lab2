package partOne;

public enum Gender {
    MALE("M", "He", "His"),
    FEMALE("F", "She", "Her");

    private final String shortForm;
    private final String pronoun;
    private final String possessivePronoun;

    Gender(String shortForm, String pronoun, String possessivePronoun) {
        this.shortForm = shortForm;
        this.pronoun = pronoun;
        this.possessivePronoun = possessivePronoun;
    }

    public String getShortForm() {
        return shortForm;
    }

    public String getPronoun() {
        return pronoun;
    }

    public String getPossessivePronoun() {
        return possessivePronoun;
    }
}
