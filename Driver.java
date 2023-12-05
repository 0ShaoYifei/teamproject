import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Driver {
    private static Store store;



    public static void main(String[] args) {

        Driver driver = new Driver();
        driver.setup();
        driver.runMenu();

    }

    private int mainMenu(){
        System.out.print("""
               __人人人人人人人人人人人人人人人__
               >BUY THINGS TO KILL OTHERS<
               __Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y__
               1)Show Me All Your Guns!!!
               2)Sell You A Better Gun!!!
               3)Give Me A Gun Like That!!!
               0)Exit
                """);
        int option=input.nextInt();
        return option;
    }

    public void runMenu(){
        int option=mainMenu();
        while (option!=0){
            switch(option){
                case 1-> listguns();
                case 2-> addguns();
                case 3-> findgun();
                default -> System.out.println("Invalid option entered");

            }
            System.out.println("Press enter key to continue...");
            input.nextLine();
            input.nextLine();
            option = mainMenu();
        }
        System.out.println("Hurry to kill everyone!!!");
        System.exit(0);
    }
    private void addguns(){
        input.nextLine();

        System.out.print("Enter the Gun Name:  ");
        String name = input.nextLine();
        System.out.print("Enter the Price:  ");
        double price = input.nextDouble();
        System.out.print("Enter the damage:  ");
        long damage =input.nextLong();
        System.out.print("Enter the description");
        String description=input.nextLine();
        System.out.print("Enter the ammunitionload");
        String ammunitionload=input.nextLine();
        System.out.print("Enter the range");
        long range=input.nextLong();
        System.out.print("Enter the category");
        String category=input.nextLine();
        System.out.print("Enter the penetratingpower");
        long penetratingpower=input.nextLong();


        Gun temp = new Gun(name,price,category,description,damage,penetratingpower,range,ammunitionload);
        boolean isAdded=store.add(temp);
        if (isAdded){
            System.out.println("Gun Added Successfully");
        }
        else{
            System.out.println("No Gun Added");
        }


    }
    private void listguns() {
        System.out.println("List of Yokes are:");
        System.out.println(store.list());
    }
    private void findgun(){

        System.out.println("Enter the gun's name");
        String name =input.nextLine();
        System.out.println(store.find(name));
        }
    private void setup(){
        int number=999999;
        store = new Store(number);
    }




    private Scanner input=new Scanner(System.in);


}
