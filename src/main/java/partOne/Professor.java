package partOne;

public class Professor extends Person {
    private Degree title;
    private String specialty;

    public enum Degree {
        CANDIDATE_OF_SCIENCES("Candidate of Sciences"),
        DOCTOR_OF_SCIENCES("Doctor of Sciences"),
        PHD("PhD"),
        MSC("MSc");

        private final String title;

        Degree(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

    public Professor(String name, Gender GENDER, String department, Degree title, String specialty) {
        super(name, GENDER, department);
        this.title = title;
        this.specialty = specialty;
    }

    @Override
    String getVerb() {
        return "teaches";
    }

    @Override
    void printDetails() {
        System.out.println("«" + getGENDER().getPronoun() + " has " + title + " degree in " + specialty + ".»");
    }
}
