import java.util.Scanner;

public class User {
    private int id;
    private int age;
    private double height;
    private double weight;
    private String name;

    public User() {
    }

    public User(int id, String name, int age, double height, double weight) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    //metodo para el id
    public int countID() {
        setId(++id);
        return getId();
    }
    //metodo toString sobre-escrito

    @Override
    public String toString() {
        return "ID: " + getId() + " NAME: " + getName() + " AGE: " + getAge() + " HEIGHT: "
                + getHeight() + " WEIGHT: " + getWeight();
    }

    //    TMB = (10 × 73) + (6.25 × 170) − (5 × 25) + 5
//            = 730 + 1062.5 − 125 + 5
//            = 1672.5 calorías (en reposo)
//
//    TDEE = 1672.5 × 1.55 ≈ 2592 calorías/día (para mantener tu peso)
    public int countMaintanceCalories() {
        //Tasa de Metabolismo Basal (TMB)
        int TMB = (int) ((10 * getWeight()) + (6.25 * getHeight()) - (5 * getAge()) + 5);
        return TMB;
    }

    public int gainWeight() {
        return (countMaintanceCalories() + 300);
    }

    public int loseWeight() {
        return (countMaintanceCalories() - 300);
    }

    public void sedentaryCalories() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Whats your goal (Gain/lose/maintenance) weight?");
            String gainLoseMaintenance = sc.nextLine();
            switch (gainLoseMaintenance.toLowerCase()) {
                case "gain":
                    System.out.println("you have to eat " + (int) (gainWeight() * 1.2) + " calories to gain weight!");
                    System.out.println("Do you want to do something else? (Yes/No)");
                    String yesNo = sc.nextLine();
                    if (yesNo.equalsIgnoreCase("YES")){
                        continue;
                    } else if (yesNo.equalsIgnoreCase("NO")) {
                        System.out.println("Exiting program!");
                        return;
                    }
                    break;
                case "lose":
                    System.out.println("you have to eat " + (int) (loseWeight() * 1.2) + " calories to lose weight!");
                    break;
                case "maintenance":
                    System.out.println("you have to eat " + (int) (countMaintanceCalories() * 1.2) + " to maintenance your weight");
                    break;
            }
        }

    }

    public void lightCalories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your goal (Gain/lose/maintenance) weight?");
        String gainLoseMaintenance = sc.nextLine();
        switch (gainLoseMaintenance.toLowerCase()) {
            case "gain":
                    System.out.println("you have to eat " + (int) (gainWeight() * 1.375) + " calories to gain weight!");
                break;
            case "lose":
                System.out.println("you have to eat " + (int) (loseWeight() * 1.375) + " calories to lose weight!");
                break;
            case "maintenance":
                System.out.println("you have to eat " + (int) (countMaintanceCalories() * 1.375) + " to maintenance your weight");
                break;
        }

    }

    public void moderateCalories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your goal (Gain/lose/maintenance) weight?");
        String gainLoseMaintenance = sc.nextLine();
        switch (gainLoseMaintenance.toLowerCase()) {
            case "gain":
                System.out.println("you have to eat " + (int) (gainWeight() * 1.55) + " calories to gain weight!");
                break;
            case "lose":
                System.out.println("you have to eat " + (int) (loseWeight() * 1.55) + " calories to lose weight!");
                break;
            case "maintenance":
                System.out.println("you have to eat " + (int) (countMaintanceCalories() * 1.55) + " to maintenance your weight");
                break;
        }

    }

    public void highCalories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your goal (Gain/lose/maintenance) weight?");
        String gainLoseMaintenance = sc.nextLine();
        switch (gainLoseMaintenance.toLowerCase()) {
            case "gain":
                System.out.println("you have to eat " + (int) (gainWeight() * 1.725) + " calories to gain weight!");
                break;
            case "lose":
                System.out.println("you have to eat " + (int) (loseWeight() * 1.725) + " calories to lose weight!");
                break;
            case "maintenance":
                System.out.println("you have to eat " + (int) (countMaintanceCalories() * 1.725) + " to maintenance your weight");
                break;
        }


    }

    public void veryHighCalories() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whats your goal (Gain/lose/maintenance) weight?");
        String gainLoseMaintenance = sc.nextLine();
        switch (gainLoseMaintenance.toLowerCase()) {
            case "gain":
                System.out.println("you have to eat " + (int) (gainWeight() * 	1.9) + " calories to gain weight!");
                break;
            case "lose":
                System.out.println("you have to eat " + (int) (loseWeight() * 	1.9) + " calories to lose weight!");
                break;
            case "maintenance":
                System.out.println("you have to eat " + (int) (countMaintanceCalories() * 1.9 ) + " to maintenance your weight");
                break;
        }

    }
}
