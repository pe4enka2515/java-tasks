import drinks.Drink;
import drinks.FirstOrder;
import drinks.SecondOrder;

public class Main {
    public static Site configureApp(){
        Site app;
        Drink drinks;
        String order = "Second";
        if (order.equals("First")){
            drinks = new FirstOrder();
            app = new Site(drinks);
        }
        else{
            drinks = new SecondOrder();
            app = new Site(drinks);
        }
        return app;
    }

    public static void main(String[] args) {
        Site app = configureApp();
        app.drink();
    }
}
