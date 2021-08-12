public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
                int weight = 59_000;
                int growth = 170;
                int bmi = service.calculate(weight,growth);
        System.out.println(bmi);

    }
}
