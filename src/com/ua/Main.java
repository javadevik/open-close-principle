package com.ua;

import com.ua.model.Order;

public class Main {

    public static void main(String[] args) {
        PreAndPostProcessing processing = new PreAndPostProcessing();
        Order order = new Order("Car", "example@gmail.com", 199.9);
        processing.process(order);
    }
}
