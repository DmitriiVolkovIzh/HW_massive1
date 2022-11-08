import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

        public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int[] weight = new int[3];
        weight[0] = 1;
        weight[1] = 2;
        weight[2] = 3;
        System.out.print(Arrays.toString(weight));
        System.out.println();

        double[] number = {1.57, 7.654, 9.986};
        System.out.print(Arrays.toString(number));

        System.out.println();
        byte[] animals = {14,15};
        System.out.print(Arrays.toString(animals));

        // Задание 2
        System.out.println();
        System.out.println("Задание 2");
            int[] weight3 = new int[3];
            weight3[0] = 1;
            weight3[1] = 2;
            weight3[2] = 3;
            for (int i = 0; i < 3; i++)
                System.out.print(weight3[i]+", ");
            System.out.println();

            double[] number1 = {1.57, 7.654, 9.986};
            for (int b = 0; b < number1.length; b++)
                System.out.print(number1[b]+", ");



            System.out.println();
            byte[] animals1 = {14,15};
            for (int v = 0; v < animals1.length; v++)
                System.out.print(animals1[v]+", ");

            // Задание 3
            System.out.println();
            System.out.println("Задание 3");
            int[] weight5 = new int[3];
            weight5[0] = 1;
            weight5[1] = 2;
            weight5[2] = 3;
            for (int m = weight5.length - 1; m >= 0; m--)
                System.out.print(weight5[m]+", ");
            System.out.println();

            double[] number2 = {1.57, 7.654, 9.986};
            for (int c = number2.length - 1; c >= 0; c--)
                System.out.print(number1[c]+", ");



            System.out.println();
            byte[] animals2 = {14,15};
            for (int v = animals2.length - 1; v >= 0; v--)
                System.out.print(animals2[v]+", ");


            // Задание 4
            System.out.println();
            System.out.println("Задание 4");
            int[] weight4 = new int[3];
            weight4[0] = 1;
            weight4[1] = 2;
            weight4[2] = 3;
            for (int i = 0; i < 3; i++)
                if (weight4[i] % 2 == 1)
                System.out.print(weight3[i]+ 1 + ", ");


    }
}