import java.util.Scanner;

public class Driver {
    private int mainMenu(){
        System.out.print("""
               __人人人人人人人人人人人人人人人__
               >BUY THINGS TO KILL OTHERS<
               __Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y^Y__
               
                """);
        int option=input.nextInt();
        return option;
    }

    public void runMenu(){
        int option=mainMenu();
        while (option!=0){
            switch(option){
                case 1->

            }
        }
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
        String description=input.next();

        Gun temp = new Gun();
        if (isAdded){
            System.out.println("Gun Added Successfully");
        }
        else{
            System.out.println("No Gun Added");
        }
    }


    private Scanner input=new Scanner(System.in);

    public static void main(String[] args){
        System.out.println("""
                goood
                goooood
                god
                
                """);
    }
}
