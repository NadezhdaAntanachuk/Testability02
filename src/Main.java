public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float heightM = 1.87F;
        float weightKg = 98;
        int bmi = service.calculate(heightM, weightKg);
        System.out.println(bmi);
    }
}