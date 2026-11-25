package partOne;

public class Student extends Person {
    private String n;
    private StudyStage stage;
    private String thesis;

    public Student(String name, Gender GENDER, String department, String n, StudyStage stage) {
        super(name, GENDER, department);
        this.n = n;
        this.stage = stage;
    }

    public Student(String name, Gender GENDER, String department, String thesis) {
        super(name, GENDER, department);
        this.stage = StudyStage.POSTGRADUATE;
        this.thesis = thesis;
    }

    @Override
    String getVerb() {
        return "studies";
    }

    @Override
    void printDetails() {
        if (stage.title.equals("Postgraduate")) {
            System.out.println("«" + getGENDER().getPossessivePronoun() + " thesis title is " + thesis + ".»");
        } else {
            System.out.println("«" + getGENDER().getPronoun() + " is " + n + "‘th year " + stage + " student.»");
        }
    }

    public enum StudyStage {
        BACHELOR("Bachelor"),
        MASTER("Master"),
        POSTGRADUATE("Postgraduate");

        private final String title;

        StudyStage(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return title;
        }
    }

}
