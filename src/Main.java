import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi = {14,13,13,13,17,18,17,17,17,35,14};
        int[] frequency = new int[dizi.length];
        Arrays.fill(frequency, -1);
        for (int i = 0; i < dizi.length; i++) {
            int counter = 1;
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[i] == dizi[j]) {
                    frequency[j] = 0;
                    counter++;
                }
            }
            if (frequency[i] != 0) {
                frequency[i] = counter;
            }
        }
        System.out.println("Dizideki elemanların frekansları:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                System.out.println(dizi[i] + " sayısı " + frequency[i] + " kere tekrar edildi.");
            }
        }
    }
}