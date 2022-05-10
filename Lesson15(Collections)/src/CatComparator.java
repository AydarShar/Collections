import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CatComparator implements Comparator<Cat> {
    public static void main(String[] args) {

        List<Cat> weightAndName = new ArrayList<>();
        weightAndName.add(new Cat("D", 5));
        weightAndName.add(new Cat("C", 3));
        weightAndName.add(new Cat("А", 2));
        weightAndName.add(new Cat("E", 6));
        weightAndName.add(new Cat("B", 3));
        weightAndName.add(new Cat("F", 7));

        weightAndName.sort(new Comparator<Cat>() {
            @Override
            public int compare(Cat o1, Cat o2) {
                if (o1.weight == o2.weight) {
                    return o1.name.compareTo(o2.name);
                }
                return o1.weight - o2.weight;
            }
        });

        weightAndName.forEach(System.out::println);
    }

    @Override
    public int compare(Cat o1, Cat o2) {
        return 0;
    }
}
