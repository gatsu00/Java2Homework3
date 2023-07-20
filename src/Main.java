public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        double weight = 98; // вес в килограммах
        double height = 1.90; // рост в метрах

        int bmiIndex = bmiService.calculate(weight, height);

        System.out.println("Индекс массы тела: " + bmiIndex);
    }
}