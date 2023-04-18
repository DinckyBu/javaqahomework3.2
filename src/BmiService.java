public class BmiService {
    public int calculate(double heightInMeters, int weightInKg) {
        double index;
                index =  weightInKg / heightInMeters / heightInMeters;
        return (int) index;
    }
}
