package org.pradeep.padmakumar.order.service;

import lombok.RequiredArgsConstructor;
import org.pradeep.padmakumar.order.server.model.Order;
import org.pradeep.padmakumar.person.client.api.PersonApi;
import org.pradeep.padmakumar.person.client.model.Person;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final PersonApi personApi;

    public Order getOrder() {
        Order order = new Order();

        Person person = personApi.getPersons().blockFirst();

        order.customerId(person.getId());
        order.customerName(person.getName());
        order.setTotalAmount(266f);

        return order;
    }

}
