package org.pradeep.padmakumar.order.controller;


import lombok.RequiredArgsConstructor;
import org.pradeep.padmakumar.order.server.api.OrderApi;
import org.pradeep.padmakumar.order.server.model.Order;
import org.pradeep.padmakumar.order.service.OrderService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class OrderController implements OrderApi {

    private final OrderService orderService;

    @Override
    public ResponseEntity<String> addOrder(Order order) {
        return ResponseEntity.ok("created");
    }

    @Override
    public ResponseEntity<List<Order>> getOrders() {
        return ResponseEntity.ok(Arrays.asList(
                orderService.getOrder(),
                new Order().id(2L).totalAmount(28.00f)
        ));
    }
}
