public class Student extends Person {

    protected String studyProgram;

    public Student (String firstName, String lastName, int age,
                    double height, double weight,
                    String country, double income,
                    boolean likesToProgram, String studyProgram) {
        super(firstName, lastName, age, height, weight, country, income, likesToProgram);

        this.studyProgram = studyProgram;
    }

    public void studyInfo() {
        System.out.println("Apmacības programma: " + studyProgram);
    }

    // Izvadam informāciju par apmacības programmu

}
