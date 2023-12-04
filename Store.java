import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Store {
    private Gun[] guns;
    private Gun[] gunssearch;
    private int total=0;
    public void Gun(int number){
    guns =new Gun[number];}
    private boolean isFull() {
        return total == guns.length;
    }
    private boolean isEmpty() {
        return total == 0;
    }
    public boolean add(Gun ayoke) {
        if (isFull()) {
            return false;
        } else {
            guns[total] = ayoke;
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
    public ArrayList<Gun> find(String name) {


        ArrayList<Gun> arraysearch=new ArrayList<>();
        String findgun = input.nextLine();

        if (!isEmpty()) {
            Pattern pattern =Pattern.compile(findgun,Pattern.CASE_INSENSITIVE);
            for (int i = 0;i<total;i++){
                Matcher matcher=pattern.matcher(guns[i].getName());
                if(matcher.matches()){
                    arraysearch.add(guns[i]);


                }
            }
        }
        return arraysearch;
    }








}
