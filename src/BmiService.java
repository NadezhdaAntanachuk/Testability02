public class BmiService {
    public int calculate(float heightM, float weightKg) {
        float bmiF = weightKg / heightM / heightM;
        int result = (int) bmiF;
        return result;
    }
}
