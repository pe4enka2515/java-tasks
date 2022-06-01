package drinks;

import coffee.Capuccino;
import coffee.Coffee;
import tea.BlackTea;
import tea.Tea;

public class FirstOrder implements Drink{
    @Override
    public Tea drinkTea() {
        return new BlackTea();
    }

    @Override
    public Coffee drinkCoffee() {
        return new Capuccino();
    }
}
