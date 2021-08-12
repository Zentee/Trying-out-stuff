package org.academiadecodigo.testingoutstuff.DesignPatterns.Builder;

import org.academiadecodigo.testingoutstuff.DesignPatterns.Builder.Builder;

public class Cake {

        private final double flour;
        private final double sugar;
        private final int eggs;
        private final double chocolate;
        private final double milk;

        public Cake(Builder cakeBuilder) {
            this.flour = cakeBuilder.getFlour();
            this.sugar = cakeBuilder.getSugar();
            this.eggs = cakeBuilder.getEggs();
            this.chocolate = cakeBuilder.getChocolate();
            this.milk = cakeBuilder.getMilk();
        }


}
