import java.util.Scanner;

public class Store {
    private Gun[] guns;

    private int total=0;

    public void setGuns(Gun[] guns) {
        this.guns = guns;
    }

    public Store(int number) {
        guns =new Gun[number];
    }


    public void Store(int number){
    guns =new Gun[number];}

    private boolean isFull() {
        return total == guns.length;
    }
    private boolean isEmpty() {
        return total == 0;
    }
    public boolean add(Gun agun) {
        if (isFull()) {
            return false;
        } else {
            guns[total] = agun;
            total++;
            return true;
        }
    }
    public String list() {
        if (isEmpty()) {
            return "No guns in the store";
        } else {
            String listOfguns = "";
            for (int i = 0; i < total; i++) {
                listOfguns += i + ": " + guns[i] + "\n";
            }
            return listOfguns;
        }
    }
    public int inputtotal(){
        return total;
    }
    private Scanner input=new Scanner(System.in);
    public int find(String search){
        for(int i=0;i<total;i++){
        String TEMP=search;
        Boolean count;
        count=guns[i].getName().contains(TEMP);
        if(count){
            System.out.println(guns[i].getName());
        }
        }

        return 0;
    }



    }









