public class Fitbyte {
    private int age;
    private int restingHeartRate;

    public Fitbyte(int age, int restingHeartRate) {
        this.restingHeartRate = restingHeartRate;
        this.age = age;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        double maxHR = 206.3 - (0.711 * age);
        double targHR = (maxHR - this.restingHeartRate) * (percentageOfMaximum) + this.restingHeartRate;
        return targHR;
    }
}
