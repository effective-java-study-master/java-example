package assignment.ch02.sub02.경태;

public class ChickenBurger extends Hamburger {

    private final boolean extraSauce; // 선택 매개변수


    ChickenBurger(Builder builder) {
        super(builder);
        extraSauce = builder.extraSauce;
    }

    public boolean isExtraSauce() {
        return extraSauce;
    }

    public static class Builder extends Hamburger.Builder<Builder>{

        private boolean extraSauce;

        public Builder addExtraSauce() {
            extraSauce = true;
            return this;
        }

        @Override
        ChickenBurger build() {
            return new ChickenBurger(this);
        }

        @Override
        protected Builder self() {
            return this;
        }

    }
}
