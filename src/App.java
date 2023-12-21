public class App {
    
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Snake and ladder problem");

        int start_pos = 0;
        int curr_pos = start_pos;

        int dice_num = (int) Math.floor((Math.random() * 6) + 1);
        System.out.println("Dice rolled " + dice_num);

        int no_play = 0;
        int ladder = 1;
        int snake = 2;

        int option = (int) Math.floor(Math.random() * 3);

        if (option == no_play) {
            System.out.println("The player didn't move and position of player after this roll is " + curr_pos);
        }

        else if (option == ladder) {
            if (curr_pos + dice_num <= 100) {
                curr_pos += dice_num;
                System.out.println("The player got a ladder and move forward and final position is " + curr_pos);
            } else {
                System.out.println(
                        "The player got a ladder but cann't move due to limited number of steps available and final position is "
                                + curr_pos);
            }
        }

        else {
            curr_pos = Math.max(0, curr_pos - dice_num);
            if (curr_pos == 0)
                System.out.println("The player got bitten by snake and will restart the game from 0th position");
            else
                System.out.println("The player got bitten by snake and downgrade to position at" + curr_pos);
        }
    }
}
