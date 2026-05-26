package Arrays.techniques_algo.kadanes_algo;

// wap in java to find the total number of users in last 3 days.

public class Sliding_win_find_the_total_numbers_of_users {

    public static void main(String[] args) {
        int[] users = {100, 90, 120, 140, 80, 150, 110, 130};
        int days = 3;

        int total = 0;
        for (int i = 0; i < days; i++) {
            total = total + users[i];
        }
        System.out.println("total numbers of users in 3 days");
        System.out.println(total);
        System.out.println("===================================");
        for (int i = 1; i <= users.length-days; i++) {
            total = total + (users[i + days - 1] - users[i - 1]);
            int avg = total / days;
            System.out.println(total + " ============= " + avg);
        }
    }

}
