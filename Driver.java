import java.util.Scanner;

public class Driver {
    private static Store store;



    public static void main(String[] args) {


        Driver driver = new Driver();
        driver.setup();
        driver.tempgunsadd("AK-47",2700,"rifle","Powerful and reliable, the AK-47 is one of the most popular assault rifles in the world. A short, controlled shot at close range is extremely lethal.",36,155,24,"30/90");
        driver.tempgunsadd("AUG",3300,"rifle","Powerful and accurate, the AUG-targeted assault rifle makes up for its low spread and high rate of fire.",28,180,31,"30/90");
        driver.tempgunsadd("FAMAS",2050,"rifle","A cheap option for players on a budget, the Famas effectively fills the gap between expensive rifles and less lethal miniature submachine guns.",30,140,16,"25/90");
        driver.tempgunsadd("M4A4",3100,"rifle","More accurate but less lethal than its counterpart, the AK-47, the M4A4 is the fully automatic assault rifle of choice for Counter-Strike.",33,140,30,"30/90");
        driver.tempgunsadd("SG 553",3000,"rifle","The SG553 for terrorists is a replacement for the AK47 for long-range combat.",30,200,26,"30/90");
        driver.tempgunsadd("AWP",4750,"rifle","The high-risk, high-reward, infamous AWP is known for its signature gunfire and its one-shot, one-shot formula.",115,195,76,"5/30");
        driver.tempgunsadd("G3SG1",5000,"rifle","The expensive G3SG1 greatly slows down movement, but compensates with a higher rate of fire than any other sniper rifle.",80,165,73,"20/90");
        driver.tempgunsadd("SCAR-20",5000,"rifle","The SCAR-20 is a semi-automatic sniper rifle with a high rate of fire and powerful long-range lethality at the price of slow movement and high price.",80,165,73,"20/90");
        driver.tempgunsadd("M249",5200,"Heavy weapon","A powerful field light machine gun, the M249 is the perfect choice for players who want high precision and high ammunition capacity at the cost of a low rate of fire.",32,160,17,"100/200");
        driver.tempgunsadd("MAG-7",1300,"Heavy weapon","Counter-strike's MAG-7 delivers devastating close-range damage. Its fast magazine loading makes it a good tactical choice.",240,150,3,"5/32");
        driver.tempgunsadd("XM1014",2000,"Heavy weapon","The XM1014 is a powerful fully automatic shotgun whose high price gives it a high rate of fire and indoor clearance capabilities.",120,160,3,"7/32");
        driver.tempgunsadd("P2000",200,"Pistol","Precise and controllable, this durable, German-made first-round pistol is perfect for dealing with opponents who don't wear armor.",35,101,24,"13/52");
        driver.tempgunsadd("P250",300,"Pistol","A pistol with low recoil and a high rate of fire, the P250 is a relatively cheap option when dealing with armored opponents.",38,128,15,"13/26");
        driver.tempgunsadd("Tec-9",500,"Pistol","An ideal handgun for terrorist maneuvering operations, the Tec-9 can inflict lethal damage at close range and has a high magazine capacity.",33,181,24,"18/90");
        driver.tempgunsadd("MP9",1250,"A miniature submachine gun","Made in Switzerland, the cutting-edge MP9 micro submachine gun is an ergonomic polymer weapon favored by private security companies.",26,120,17,"30/120");
        driver.tempgunsadd("P90",2350,"A miniature submachine gun","Made more recognizable by its unique buttonless design, this weapon is ideal for shooting while moving thanks to the P90's high-capacity magazine and low recoil.",26,138,11,"50/100");
        driver.tempgunsadd("UMP-45",1200,"A miniature submachine gun","The middle child in the much-misunderstood family of miniature submachine guns, the UMP45's small magazine is its only drawback, otherwise it would be a generalist among close-range automatic firearms.",35,130,11,"25/100");


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
        input.nextLine();
        String name =input.nextLine();

        store.find(name);
        }
    private void setup(){
        int number=999999;
        store = new Store(number);
    }
    public void tempgunsadd(String name, double price, String category, String description, long damage, long penetratingpower, long range, String ammunitionload){
        Gun temp = new Gun(name,price,category,description,damage,penetratingpower,range,ammunitionload);
        boolean isAdded=store.add(temp);
    }




    private Scanner input=new Scanner(System.in);


}
