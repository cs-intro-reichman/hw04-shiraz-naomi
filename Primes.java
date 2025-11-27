public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[num + 1];
        int count = 0;
        for (int i = 2; i < arr.length; i++)
            arr[i] = true;

        for (int j = 2; num >= j + j; j++) {
            if (arr[j] == true) {
                for (int w = j * j; w < arr.length; w += j) {
                    arr[w] = false;
                }
            }
            count++;
        }
        System.out.println("Prime numbers up to " + num + " ");
        for (int i = 2; i <= num; i++) {
            if (arr[i]) {
                System.out.println(i);
            }
        }
        System.out.println(
                "There are " + count + " primes between 2 and " + num + " (" + (int) (((double) num / count) * 10)
                        + "% are primes)");

    }
}