import java.util.*;

public class Collections {
    public static void main(String[] args) {
        System.out.println("------------- пункт 1. --------------");
        /* пункт 1.
         * Написать абстрактный класс Animal,
         * отнаследоваться от него классами Cat и Dog.
         * Создать три List<>, 4 котика и 3 собачки.
         * В первый лист должна быть возможность сложить всех животных,
         * во второй - только котиков, в третий - только собачек.
         * */

        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Мур", 2)); // проверил что и кошку,
        animals.add(new Dog("Гав")); // и собаку можно добваить в animals
        animals.forEach(System.out::println);
        System.out.println("---- вывод выше - проверка что 1-ый List принимает и кошек, и собак ----");

        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();

        cats.add(new Cat("Мурлыга", 3));
        cats.add(new Cat("Кис", 4));
        cats.add(new Cat("Фриказоид", 5));
        cats.add(new Cat("Бегемот", 3));
        // cats.add(new Dog("Brrr"));
        cats.forEach(System.out::println);
        System.out.println("---- вывод выше - проверка что 2-ой List принимает 4 созданных котика ----");

        dogs.add(new Dog("Глютен"));
        dogs.add(new Dog("Винни"));
        dogs.add(new Dog("Лаки"));
        //dogs.add(new Cat("Sshshsh"));
        dogs.forEach(System.out::println);
        System.out.println("---- вывод выше - проверка что 3-ий List принимает 3 созданных собаки ----");

        System.out.println("------------- пункт 2. --------------");
        /* пункт 2.
         * Отнаследоваться от Cat классами Lion, Tiger, ThaiCat, SiameseCat, SiberianCat.
         * Добавить интерфейс Strokable с методом stroke()
         * и реализовать его в последних трёх классах для котеек,
         * интерфейс WildCat сделать без методов и добавить первым двум классам.
         * Добавить по одному List, в который можно положить только диких кошек
         * и кошек, которых можно погладить.*/

        List<WildCat> wildCats = new ArrayList<>();
        wildCats.add(new Lion("Симба"));
        wildCats.add(new Tiger("Тигра"));
        // wildCats.add(new SiameseCat("Pfffff!"));
        wildCats.forEach(System.out::println);
        System.out.println("---- вывод выше - List c дикими кошками и только ----");


        List<Strokable> strokableCats = new ArrayList<>();
        strokableCats.add(new SiameseCat("Сиамская"));
        strokableCats.add(new ThaiCat("Тайская"));
        strokableCats.add(new SiberianCat("Сибирская"));
        // strokableCats.add(new Lion("Rrrrr!"));
        strokableCats.forEach(System.out::println);
        System.out.println("---- вывод выше - List c кошками, которых можно погладить ----");

        System.out.println("------------- пункт 3. --------------");
        /* пункт 3.
         * Добавить коллекцию, в которую можно положить только уникальных кошек,
         * проверить, что одну и ту же кошечку туда положить нельзя,
         * точнее, можно, но будет храниться только одна кошечка.
         * */

        Set<Cat> uniqueCat = new HashSet<>();
        Cat cat = new Cat("Барс", 13);
        uniqueCat.add(cat);
        uniqueCat.add(cat);
        uniqueCat.add(cat);
        uniqueCat.forEach(System.out::println);
        System.out.println("---- вывод выше - Set с уникальной кошкой. 3 раза кладем, но хранится только одна ----");

        System.out.println("------------- пункт 4. --------------");
        /* пункт 4.
         * Добавить коллекцию, в которой в ключах будут храниться хозяева кошек,
         * а в значениях будут храниться кошечки.
         * */
        Map<String, Cat> catOwners = new HashMap<>();

        catOwners.put("Инокентий", new Cat("Клубок", 2));
        catOwners.put("Инна", new Cat("Плюшка", 4));
        catOwners.forEach((k, v) -> System.out.println(k + " владеет " + v));
        System.out.println("---- вывод выше - Map в которой: k - владелец, v - кошка ----");

        System.out.println("------------- пункт 5. --------------");
        /* пункт 5.
         * Первое задание со звёздочкой, как сделать так,
         * чтобы можно было в коллекции из 4 задания
         * у одного и того же хозяина хранить несколько кошечек,
         * реализовать такое хранение.
         * */

        Map<String, ArrayList<Cat>> multipleCats = new HashMap();
        multipleCats.put("Инокентий", new ArrayList<>());
        multipleCats.get("Инокентий").add(new Cat("Барсик", 5));
        multipleCats.get("Инокентий").add(new Cat("Мурка", 6));
        multipleCats.get("Инокентий").add(new Cat("Шурик", 3));

        multipleCats.forEach((k, v) -> System.out.println(k + " владеет " + v));
        System.out.println("---- вывод выше - Map в которой реализвано мульти values");

        System.out.println("------------- пункт 6. --------------");
        /* пункт 6.
         * Добавить котикам поле с весом, создать 5 котиков с разным весом,
         * положить в коллекцию и отсортировать их по весу.
         * */

        List<Cat> catWeight = new ArrayList<>();
        catWeight.add(new Cat("D", 5));
        catWeight.add(new Cat("C", 3));
        catWeight.add(new Cat("B", 2));
        catWeight.add(new Cat("J", 6));
        catWeight.add(new Cat("A", 3));
        catWeight.add(new Cat("F", 7));

        catWeight.sort(Cat::compareTo);

        catWeight.forEach(System.out::println);
        System.out.println("---- вывод выше - 5 котиков отсортированных по весу ----");

        System.out.println("------------- пункт 7. --------------");
        /* пункт 7.
         * Второе задание со звёздочкой.
         * Если вес у котиков одинаковый, то нужно сортировать по кличке в алфавитном порядке.
         * (реализовать через Comparator<T>)
         * */
        List<Cat> weightAndName = new ArrayList<>();
        weightAndName.add(new Cat("D", 5));
        weightAndName.add(new Cat("C", 3));
        weightAndName.add(new Cat("B", 2));
        weightAndName.add(new Cat("A", 6));
        weightAndName.add(new Cat("I", 3));
        weightAndName.add(new Cat("F", 7));

        weightAndName.sort(Cat::compare);

        weightAndName.forEach(System.out::println);

    }
}
