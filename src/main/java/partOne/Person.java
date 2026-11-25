package partOne;

public abstract class Person {
    private String name;
    private Gender GENDER;
    private String department;

    public Person(String name, Gender GENDER, String department) {
        this.name = name;
        this.GENDER = GENDER;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public Gender getGENDER() {
        return GENDER;
    }

    public String getDepartment() {
        return department;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGENDER(Gender GENDER) {
        this.GENDER = GENDER;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void print() {
        System.out.println("«This is " + name + ". " + GENDER.getPronoun() + " " + getVerb() + " at " + department + "»");
        printDetails();
    }

    abstract String getVerb();

    abstract void printDetails();
}
