package effectiveJava;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Mexican {
    public enum Topping { TOMATO, CHEESE, BEEF, CHICKEN, PEPPERS, SALSA }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addIngredient(Topping topping){
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }
        
        abstract Mexican build();

        protected abstract T self();
    }
    Mexican(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
    
    public void printToppings() {
    	if(!toppings.isEmpty()) {
    		toppings.stream().forEach(topping ->{
    			System.out.println(topping.name());
    		});
    	}
    }
}
