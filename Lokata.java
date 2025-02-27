public class Lokata {
    public static void main(String[] args) {

        float interestRate = 0.05f;

        float value = 40000;

        double duration = 3;

        float interest;

        float futureValue;

        interest = (float) (value * interestRate*duration);

        System.out.println(interest);

        futureValue = value + interest;

        System.out.println(futureValue);
    }

}
