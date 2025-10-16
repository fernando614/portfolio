import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    static boolean flag = true;
    static int opc;

    public static void main(String[] args) {
        //creo el objeto scanner
        Scanner sc = new Scanner(System.in);
        User u = new User();

        while (flag) {
            System.out.println("****** Welcome to Mexi-Macros ******");
            System.out.println("ID: " + u.countID());
            System.out.println("Enter your name: ");
            u.setName(sc.nextLine());
            break;
        }
        while (flag) {
            try {
                System.out.println("Enter your age: ");
                u.setAge(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("ONLY NUMBERS!");
                sc.nextLine();
            }
        }
        while (flag) {
            try {
                System.out.println("Enter your heigth in centimeters: ");
                u.setHeight(sc.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("ONLY NUMBERS!");
                sc.nextLine();
            }
        }
        while (flag) {
            try {
                System.out.println("Enter your weight in kilograms: ");
                u.setWeight(sc.nextDouble());
                break;
            } catch (Exception e) {
                System.out.println("ONLY NUMBERS!");
                sc.nextLine();
            }
        }
        User user = new User(u.getId(), u.getName(), u.getAge(), u.getHeight(), u.getWeight());
        List<User> users = new ArrayList<>();
        users.add(user);

        while (flag){
            System.out.println(u.getName() + " " + "this are your maintenance calories: " + u.countMaintanceCalories());
            break;
        }
        sc.nextLine();
        do {
            System.out.println("***** Total Daily Energy Expenditure (GET or TDEE) *****");
            try {
                System.out.println("(1) Sedentary (little or no exercise) \n" + "(2) Light (1-3 days/week)\n"
                        + "(3) Moderate (3-5 days/week)\n" + "(4) High (6-7 days/week)  \n" +
                        "(5) VeryHight Very high (intense training or very active physical activity)");
                opc = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ONLY NUMBERS ARE ALLOWED (1) (2) (3) (4) (5)");
                sc.nextLine();
                continue;
            }
            switch (opc){
                case 1:
                    u.sedentaryCalories();
                    break;
                case 2:
                    u.lightCalories();
                    break;
                case 3:
                    u.moderateCalories();
                    break;
                case 4:
                    u.highCalories();
                    break;
                case 5:
                    u.veryHighCalories();
                    break;
                case 6:
                    System.out.println("Exiting program!");
                    return;

            }
            break;
        }while (flag);



    }
}
