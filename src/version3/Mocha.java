package version3;

/**
 * A Decorator implementation. Notice that a decorator has a Beverage 
 * component -- that's the secret to how a decorator works -- it combines 
 * data from the component with data from itself. In this example it gets
 * the cost by adding its own, plus that of the beverage. And it gets its
 * description by combining its own with that of the beverage.
 * 
 * @author Head First Design Patterns
 */
public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverageToBeDecorated) {
        super(beverageToBeDecorated);
    }

    @Override
    public String getDescription() {
        // combined descrition
        return super.getDescription() + ", Mocha";
    }

    @Override 
    public double cost () {
        // combined cost
        return 0.1 + super.cost();
    }
}