package drinks;

import coffee.Coffee;
import coffee.Raf;
import tea.GreenTea;
import tea.Tea;

public class SecondOrder implements Drink{

    @Override
    public Tea drinkTea() { return new GreenTea(); }

    @Override
    public Coffee drinkCoffee() {
        return new Raf();
    }
}
