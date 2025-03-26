import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        List<Integer> list = List.of(10, 5, 8, 20, 7);
        list.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("Không tìm thấy số lớn thứ hai"));
        List<Integer> singleElementList = List.of(10);
        singleElementList.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("Không tìm thấy số lớn thứ hai"));
        List<Integer> allSameList = List.of(10, 10, 10);
        allSameList.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().ifPresentOrElse(System.out::println, () -> System.out.println("Không tìm thấy số lớn thứ hai"));
    }
}
