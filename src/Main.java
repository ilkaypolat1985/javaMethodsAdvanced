public class Main {

    public static void main(String[] args) {
        add();
        remove();
        update();

        int total = sum(3, 5);
        System.out.println("Total is " + total);

        String city = getCity();
        System.out.println("City is " + city);
    }

    public static void add(){
        System.out.println("Added!");
    }

    public static void remove(){
        System.out.println("Removed!");
    }

    public static void update(){
        System.out.println("Updated!");
    }

    public static int sum(int number1, int number2){
        return number1 + number2;
    }

    public static String getCity(){
        return "Ankara";
    }
}
