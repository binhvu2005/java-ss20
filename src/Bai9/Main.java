package Bai9;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = List.of(

                new Order(1, "Quý", LocalDate.of(2025, 3, 20), Optional.of(LocalDate.of(2025, 3, 25))),

                new Order(2, "Lan", LocalDate.of(2025, 3, 21), null),

                new Order(3, "Minh", LocalDate.of(2025, 3, 22), Optional.of(LocalDate.of(2025, 3, 23))),

                new Order(4, "Huyền", LocalDate.of(2025, 3, 23), null),

                new Order(5, "Việt", LocalDate.of(2025, 3, 23), Optional.of(LocalDate.of(2025, 3, 30)))

        );

        System.out.println("== Danh sách đơn hàng đã giao ==");
        orders.stream().filter(order -> order.getDeliveryDate() != null).forEach(order -> {
            System.out.println("ID: " + order.getId() + " | KH: " + order.getCustomerName() + " | Đặt: " + order.getCreatedDate() + " | Giao: " + order.getDeliveryDate().orElse(null));
        });
        System.out.println("\n== Danh sách đơn hàng chưa giao ==");
        orders.stream().filter(order -> order.getDeliveryDate()== null).forEach(order -> {
            System.out.println("ID: " + order.getId() + " | KH: " + order.getCustomerName() + " | Đặt: " + order.getCreatedDate() + " | Giao: Chưa giao");
        });
        System.out.println("\n== Số đơn hàng đã giao từ ngày 2025-03-17 đến 2025-03-23 ==");
        long count = orders.stream().filter(order -> order.getDeliveryDate()!= null && order.getDeliveryDate().get().isAfter(LocalDate.of(2025, 3, 17)) && order.getDeliveryDate().get().isBefore(LocalDate.of(2025, 3, 24))).count();
        System.out.println("Tổng đơn: " + count);
    }
}
