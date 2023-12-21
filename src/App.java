public class App {

    static int final_pos(int initial_pos, int option, int player_num) {
        int dice_num = (int) Math.floor((Math.random() * 6) + 1);
        if (option == 0)
            System.out.println(player_num + " no_movement ->" + initial_pos);
        else if (option == 1) {
            if (initial_pos + dice_num == 100) {
                initial_pos = 100;
                System.out.println(player_num + " won ->" + initial_pos);
            } else if (initial_pos + dice_num < 100) {
                initial_pos += dice_num;
                System.out.println(player_num + " ladder ->" + initial_pos);
            } else {
                System.out.println(player_num + " ladder but no movement ->" + initial_pos);
            }
        } else {
            initial_pos = Math.max(0, initial_pos - dice_num);
            System.out.println(player_num + " snake -> " + initial_pos);
        }
        return initial_pos;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Snake and ladder problem");
        int player_1_pos = 0;
        int player_2_pos = 0;
        int cnt = 0;

        while (player_1_pos < 100 && player_2_pos < 100) {
            int option = (int) Math.floor((Math.random()) * 3);
            if (cnt % 2 == 0) {
                System.out.print("Chance of player ");
                player_1_pos = final_pos(player_1_pos, option, 1);

                if (option == 1)
                    cnt += 2;
                else
                    cnt++;
            } else {
                System.out.print("Chance of player ");
                player_2_pos = final_pos(player_2_pos, option, 2);

                if (option == 1)
                    cnt += 2;
                else
                    cnt++;
            }

        }

    }
}
