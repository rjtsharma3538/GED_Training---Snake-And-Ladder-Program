public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Snake and ladder problem");

        int start_pos = 0;
        int curr_pos = start_pos;

        int no_move = 0;
        int ladder = 1;
        int snake = 2;

        while (curr_pos < 100) {
            int dice_num = (int) Math.floor((Math.random() * 6) + 1);
            System.out.println("Dice rolled " + dice_num);

            int option = (int) Math.floor((Math.random() * 3));

            if (option == no_move) {
                System.out.println("no_move -> " + curr_pos);
            } else if (option == ladder) {
                if (curr_pos + dice_num == 100)
                    System.out.println(" u won -> " + curr_pos);
                else if (curr_pos + dice_num < 100)
                    System.out.println("ladder -> " + curr_pos);
                else
                    System.out.println("ladder but no move -> " + curr_pos);
            } else {
                curr_pos = Math.max(0, curr_pos - dice_num);
                System.out.println("snake -> " + curr_pos);
            }
        }   
    }
}
