import java.beans.beancontext.BeanContextChild;

public class Main {
    public static void main(String[] args) {
        double numbers[] = {0.6, -0.2, 13.5, -3.5, 10.4, 2.3, 1.1, 4.4, 8.9, 2.5, 1.7, -8.7, 6.1, 9.3, 4.1};
        double sum = 0.0;
        int a = 0;
        boolean c = false;
        for (double j : numbers) {
            if (j < 0) {
                c = true;
            }
            if (j > 0 && c) {
                sum = sum + j;
                a++;

            }
            System.out.println(sum / a);

        }

    }
}