public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double weightKg = 70;
        double heightMeters = 1.75;

        int bmi = service.calculate(weightKg, heightMeters);

        System.out.println(bmi);
    }
}