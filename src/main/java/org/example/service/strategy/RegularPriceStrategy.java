package org.example.service.strategy;

import org.example.model.entity.Event;
import org.example.model.entity.User;
import org.springframework.stereotype.Component;

@Component
public class RegularPriceStrategy implements PriceStrategy {
    @Override
    public double calculate(User user, Event event) {
        return event.getBasePrice();
    }
}