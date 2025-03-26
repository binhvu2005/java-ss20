import java.util.List;

public class Bai2 {
    public static void main(String[] args) {
       List<Integer> list1 = List.of(1, 2, 3, 4, 5);
       list1.stream().filter(e -> e % 2 != 0).reduce(Integer::sum).ifPresent(System.out::println);
    }
}
