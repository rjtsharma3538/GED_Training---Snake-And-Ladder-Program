public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Snake and ladder problem");

        int dice_num = (int) Math.floor((Math.random() * 6) + 1);
        System.out.println("Dice rolled " + dice_num);
    }
}
