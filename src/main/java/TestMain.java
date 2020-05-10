import pizzaSplit.Pizza;

public class TestMain {

    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        String[] test = new String[]{"A..","AAA","..."};
        int ways = pizza.ways(test, 3);
        System.out.print("has " + ways + " ways to split pizza");
    }
}
