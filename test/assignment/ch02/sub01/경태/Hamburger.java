package assignment.ch02.sub01.경태;

import java.util.EnumSet;
import java.util.Set;

public abstract class Hamburger {

    public enum Topping{
        HAM, MUSHROOM, ONION, PEPPER, SAUSAGE, BEEF, CHICKEN
    }

    final Set<Topping> toppings;

    Hamburger(Builder<?> builder){
        toppings = builder.toppings.clone();
    }

    public Set<Topping> getToppings() {
        return toppings;
    }

    abstract static class Builder<T extends Builder<T>> {

        private EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Hamburger build();

        protected abstract T self();

    }
}
