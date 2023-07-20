public class BmiService {
    public int calculate(double weight, double height) {
        double bmiIndex = weight / (height * height);
        return (int) bmiIndex;
    }
}
