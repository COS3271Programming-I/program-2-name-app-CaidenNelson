public class Name {
    static Scanner userinput = new Scanner(System.in);
    public static void main(String[] args) {
        String firstName;
        String lastName;
        int age;
        double averageSleep;


        System.out.println("What is your first name?");
        firstName = userinput.nextLine();

        System.out.println("What is your last name");
        lastName = userinput.nextLine();

        System.out.println("How old are you?");
        age = userinput.nextInt();

        System.out.println("How much sleep do you get on average every night?");
        averageSleep = userinput.nextDouble();


        System.out.printf(firstName +' '+ lastName +' '+ "Is"+' ' + age +"years old and gets " + averageSleep +' '+ "hours of sleep" );


    }
}
