public class BmiService {
    public int calculate(double weightKg, double heightMeters) {
        double index = weightKg / (heightMeters * heightMeters);
        return (int) index;
    }
}