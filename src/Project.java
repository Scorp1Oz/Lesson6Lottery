import java.util.Arrays;
import java.util.Random;
public class Project {

        public static void main(String[] args) {
            int[] lotteryNumbers = new int[7];
            int[] playerNumbers = new int[7];
            Random random = new Random();

            for (int i = 0; i < 7; i++) {
                lotteryNumbers[i] = random.nextInt(10);
                playerNumbers[i] = random.nextInt(10);
            }

            Arrays.sort(lotteryNumbers);
            Arrays.sort(playerNumbers);

            System.out.println("Відсортований масив лотерейних чисел: " + Arrays.toString(lotteryNumbers));
            System.out.println("Відсортований масив гравця: " + Arrays.toString(playerNumbers));

            int matchingNumbers = 0;
            for (int i = 0; i < 7; i++) {
                if (lotteryNumbers[i] == playerNumbers[i]) {
                    matchingNumbers++;
                }
            }

            System.out.println("Кількість збігів: " + matchingNumbers);
        }
}

