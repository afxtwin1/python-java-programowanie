public class Lokata {
    public static void main(String[] args) {

        float interestRate = 0.10f;

        float value = 8000;

        float duration = 3;

        float interest;

        float futureValue;

        interest = (float) (value * interestRate*duration);

        System.out.println(interest);

        futureValue = value + interest;

        System.out.println(futureValue);

        float d = (float) (12000.0f/ 8000*0.1);
        System.out.println(d);
    }

}
