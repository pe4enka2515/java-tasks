import coffee.Coffee;
import drinks.Drink;
import tea.Tea;

public class Site {
    private Tea tea;
    private Coffee coffee;

    public Site(Drink drinks){
        tea = drinks.drinkTea();
        coffee = drinks.drinkCoffee();
    }
    public void drink(){
        tea.drink();
        coffee.drink();
    }
}
