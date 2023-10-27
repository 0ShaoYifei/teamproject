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
        input.nextLine();  //dummy read of String to clear the buffer - bug in Scanner class.

        System.out.print("Enter the Gun Name:  ");
        String name = input.nextLine();
        System.out.print("Enter the Price:  ");
        double price = input.nextDouble();

        Yoke temp = new Yoke(yokeName, yokePrice);
        boolean isAdded = shop.add(temp);
        if (isAdded){
            System.out.println("Yoke Added Successfully");
        }
        else{
            System.out.println("No Yoke Added");
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
