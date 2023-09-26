package assignment.ch02.sub01.경태;

public class BeefBurger extends Hamburger {

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    private final Size size; //필수 매개변수

    private BeefBurger(Builder builder) {
        super(builder);
        size = builder.size;
    }

    public Size getSize() {
        return size;
    }

    public static class Builder extends Hamburger.Builder<Builder> {

        private final Size size;

        public Builder(Size size) {
            this.size = size;
        }

        @Override
        BeefBurger build() {
            return new BeefBurger(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }
}



