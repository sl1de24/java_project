
public class Person {

    protected String firstName, lastName, country;
    protected int age;
    protected double height, weight, income;
    protected boolean likesToProgram;

    // Uzstaisīju visas klases kas ir nepieciešamas
    // Klases ir protected, jo Student manto personu, viņam ir jābūt pieejamām


    public Person (String firstName, String lastName, int age, double height,
                   double weight, String country, double income, boolean likesToProgram) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.country = country;
        this.income = income;
        this.likesToProgram = likesToProgram;

    }

    // Uzstaisīju konstruktoru

    public void printInfo() {
        System.out.println("Vārds: " + firstName);
        System.out.println("Uzvārds: " + lastName);
        System.out.println("Vecums: " + age);
        System.out.println("Augums metros: " + height);
        System.out.println("Svars kg: " + weight);
        System.out.println("Dzīvesvietas valsts: " + country);
        System.out.println("Ienākumi: " + income);
        System.out.println("Vai patīk programmēt?: " + (likesToProgram ? "jā" : "nē"));
    }

    // Izvadam informāciju par lietotāju
}



