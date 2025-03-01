import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Atveram Scanner
        String restart; // String restart priekš while cikla lai restartēt app

        do {

            System.out.println("---Informācija par studentu---");

            Person person = new Person("Artūrs", "Ņegoda", 28, 170, 70,
                    "Latvija", 1300, true);
            person.printInfo();

            Student student = new Student("Artūrs", "Ņegoda", 28, 170, 70,
                    "Latvija", 1300, true, "Programmēšanas pamati");
            student.studyInfo();
            System.out.println();

            // Izvadīju Objektu person un student


            System.out.println("---Lietotāju datu ievāde---");

            String firstName;
            do {
                System.out.println("Ievadiet savu vārdu: ");
                firstName = scanner.nextLine();
                if (firstName.trim().isEmpty()) {
                    System.out.println("Vārds nevar būt tukšs. Lūdzu, ievadiet savu vārdu!");
                }
            } while (firstName.trim().isEmpty());

            String lastName;
            do {
                System.out.println("Ievadiet savu uzvārdu: ");
                lastName = scanner.nextLine();
                if (lastName.trim().isEmpty()) {
                    System.out.println("Uzvārds nevar but tukšs. Lūdzu, ievadiet savu uzvārdu!");
                }
            } while (lastName.trim().isEmpty());

            System.out.println("Ievadiet savu vēcumu: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ievadiet savu augumu: ");
            String augums_str = scanner.nextLine().replace(",", ".");
            double height = Double.parseDouble(augums_str);

            System.out.println("Ievadiet savu svaru: ");
            double weight = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Ievadiet valsti, kurā dzīvojat: ");
            String country = scanner.nextLine();

            System.out.println("Ievadiet savus mēnēša ienākumus: ");
            double income = Double.parseDouble(scanner.nextLine());

            System.out.println("Vai Jūms patīk programmēt? (jā/nē): ");
            boolean likesToProgram = scanner.nextLine().equalsIgnoreCase("jā");

            // Izmantojot skaneri, lietotājs var ievadīt informāciju par sevi

            System.out.println("\n---Informācija par lietotāju---");
            System.out.println("Vārds: " + firstName);
            System.out.println("Uzvārds: " + lastName);
            System.out.println("Vecums: " + age + " Gadi ");
            System.out.println("Augums metros: " + height + " Metri ");
            System.out.println("Svars kg: " + weight + " Kg ");
            System.out.println("Dzīvesvietas valsts: " + country);
            System.out.println("Ienākumi: " + income + " EUR ");
            System.out.println("Vai patīk programmēt?: " + (likesToProgram ? "Jā" : "Nē"));

            // Parādījam informāciju kuru ievādija lietotajs

            System.out.println("\n---Paplašināta informācija---");
            System.out.println("Vecums dienas: " + (age * 365) + " Dienas");
            System.out.println("Augums centimetros: " + (height * 100) + " cm");
            System.out.println("Gada ienākumi: " + (income * 12) + " EUR");

            double bmi = weight / (height * height);
            System.out.println("Ķermena masas indekss ir: " + String.format("%.2f", bmi));

            // Aprēķinām KMI indeksu un saglabājam to mainīga BMI
            // %.2f norāda, ka BMI numurs ir jāizvada ar divām zīmēm aiz komata.

            if (bmi < 18.5) {
                System.out.println("ĶMI katerogija: Nepietiekams svars");
            } else if (bmi < 25) {
                System.out.println("ĶMI katerogija: Normals svars");
            } else if (bmi < 30) {
                System.out.println("ĶMI katerogija: Liekas svars");
            } else {
                System.out.println("ĶMI kategorija: Ļoti liels svars");
            }

            if (income < 1500) {
                System.out.println("Jūsu ienākumi ir zemāki par videjām, vajag tomēr sākt mācīties JAVA?");
            }

            // Ja lietotāja ienākumi ir mazāki par 1500, tad parādās izvade ar tekstu ka ienākumi ir zemāki

            if (country.equalsIgnoreCase("Latvija")) {
                System.out.println("Jūs dzīvojat Latvijā, videjie ienākumi šeit ir ap 1500 eiro mēnesi.");

            }

            System.out.println("\n---------------------------");
            System.out.println("Jūs varat ievadīt 'Jā' lai restartēt programmu, vai 'Nē' lai iziet no viņas.");
            restart = scanner.nextLine();

        } while (restart.equalsIgnoreCase("Jā"));

        // Pievienots cikls while lai varētu būt iespēja atkartoti palaist programmu //

        scanner.close();

        // Aizveram Scanner //

    }
}