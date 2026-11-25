package partOne;

public class Main {
    public static void main(String[] args) {
        Person[] persons = getPersons();
        printAll(persons);
    }

    private static Person[] getPersons() {
        return new Person[]{
                new Professor("Ronald Turner", Gender.MALE, "Computer science", Professor.Degree.PHD, "Programming paradigms"),
                new Professor("Ruth Hollings", Gender.FEMALE, "Jurisprudence", Professor.Degree.MSC, "Domestic arbitration"),
                new Student("Leo Wilkinson", Gender.MALE, "Computer science", "III", Student.StudyStage.BACHELOR),
                new Student("Anna Cunningham", Gender.FEMALE, "World economy", "I", Student.StudyStage.BACHELOR),
                new Student("Jill Lundqvist", Gender.FEMALE, "Jurisprudence", "I", Student.StudyStage.MASTER),
                new Student("Ronald Correa", Gender.MALE, "Computer science", "Design of a functional programming language")
        };
    }

    static void printAll(Person[] persons) {
        for (Person p : persons) {
            p.print();
        }
    }
}
