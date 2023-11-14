public class Store {
    private Gun[] guns;
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
            return "No yokes in the store";
        } else {
            String listOfYokes = "";
            for (int i = 0; i < total; i++) {
                listOfYokes += i + ": " + guns[i] + "\n";
            }
            return listOfYokes;
        }
    }
    public int inputtotal(){
        return total;
    }
    public Gun find(String name) {

        Gun foundYoke =  null;

        if (!isEmpty()) {
            for (int i = 0; i < total; i++)
                if (guns[i].getName().equals(name))
                    foundYoke = guns[i];
        }
        else {
            return null;
        }
        return foundYoke;
    }








}
