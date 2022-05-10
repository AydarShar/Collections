import java.util.Comparator;

public class Cat extends Animal implements Comparable<Cat> {
    public String name;
    public Integer weight;

    public Cat(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    // Метод Compare для пункта 6:
    @Override
    public int compareTo(Cat o) {
        return weight.compareTo(o.weight);
    }


// Наследники Cat:

// Дикие кошки (Lion, Tiger):

    static class Lion extends Cat implements WildCat {

        private static final Integer weight = 34;

        public Lion(String name) {
            super(name, weight);
        }

    }

    static class Tiger extends Cat implements WildCat {

        private static final Integer weight = 44;

        public Tiger(String name) {
            super(name, weight);
        }

    }

// Кошки домашние (ThaiCat, SiameseCat, SiberianCat):

    static class ThaiCat extends Cat implements Strokable {
        private static final Integer weight = 3;

        public ThaiCat(String name) {
            super(name, weight);
        }

        @Override
        public void stroke() {
        }

    }

    static class SiameseCat extends Cat implements Strokable {
        private static final Integer weight = 4;

        public SiameseCat(String name) {
            super(name, weight);
        }

        @Override
        public void stroke() {
        }

    }

    static class SiberianCat extends Cat implements Strokable {

        private static final Integer weight = 5;

        public SiberianCat(String name) {
            super(name, weight);
        }

        @Override
        public void stroke() {
        }

    }
}