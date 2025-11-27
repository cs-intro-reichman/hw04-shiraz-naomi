public class Primes {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        boolean[] arr = new boolean[num + 1];

        for (int i = 2; i < arr.length; i++)
            arr[i] = true;

        for (int j = 2; num >= j + j; j++) {
            if (arr[j] == true) {
                for (int w = j * j; w < arr.length; w += j) {
                    arr[w] = false;
                }
            }
        }
        System.out.println("Prime numbers up to " + num + ":");
        int count = 0;
        for (int i = 2; i <= num; i++) {
            if (arr[i]) {
                System.out.println(i);
                count++;
            }
        }

        int percentage = (int) ((count * 100.0) / num);

        System.out.println("There are " + count +
                " primes between 2 and " + num +
                " (" + percentage + "% are primes)");

    }
}