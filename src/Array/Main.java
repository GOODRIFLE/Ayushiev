package Array;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа через пробел, затем введите \"done\" и нажмите \"Enter\":");
        ArrayList<Integer> inputs = new ArrayList<>();
        while (in.hasNextInt()){
            inputs.add(in.nextInt());
        }
        for (Integer input : inputs) {
            if (input % 3 == 0) {
                System.out.print(input + " ");
            }
        }
    }
}
