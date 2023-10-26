import java.util.Scanner;

public class gun {
    private Scanner input=new Scanner(System.in);
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public gun() {
    }

    private int mainMenu(){
        System.out.print("""
                
                """);
        int option=input.nextInt();
        return option;
    }

}
