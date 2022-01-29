import com.bach.factorymethod.BasePizzaFactory;
import com.bach.factorymethod.Pizza;
import com.bach.factorymethod.PizzaFactory;
import org.junit.Test;

public class PizzaFactoryTest {

    @Test
    public void testMakePizzas(){
        BasePizzaFactory pizzaFactory = new PizzaFactory();
        Pizza cheesePizza = pizzaFactory.createPizza(1);
        Pizza veggiePizza = pizzaFactory.createPizza(3);
    }
}
