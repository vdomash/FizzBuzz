public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            if (divisible(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean divisible(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

            return divisibleBy3 || divisibleBy5;
        }
}
