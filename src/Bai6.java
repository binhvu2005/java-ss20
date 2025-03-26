import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public class Bai6 {
    public static void main(String[] args) {
        List<String> items = List.of("apple", "banana", "apple", "orange", "banana", "apple");
        System.out.println("thời điểm xử lý: " + LocalDateTime.now());
        items.stream().distinct().forEach(item -> {
            long count = items.stream().filter(i -> i.equals(item)).count();
            System.out.println(item + " xuất hiện " + count + " lần");
        });

    }
}
