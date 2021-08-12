public class BmiService {
    public int calculate(int weight, int growth)
    // вес - граммы,рост - сантиметры
    {
        int bmi = weight / growth;
        return bmi;
    }
}
