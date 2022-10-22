import service.Cocinero;
import service.impl.CocineroNoVeggie;
import service.impl.CocineroVeggie;

public class Main {
    public static void main(String[] args) {

        Cocinero cocineroVeggie = new CocineroVeggie();
        Cocinero cocineroNoVeggie = new CocineroNoVeggie();

        cocineroVeggie.hacerPizza();
        cocineroNoVeggie.hacerPizza();

    }
}