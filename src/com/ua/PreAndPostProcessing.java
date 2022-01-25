package com.ua;

import com.ua.model.Order;

public class PreAndPostProcessing extends OrderProcess {
    @Override
    public void process(Order order) {
        preProcessing();
        super.process(order);
        postProcessing();
    }

    private void preProcessing() {
        System.out.println("Execute something in pre-processing");
    }

    private void postProcessing() {
        System.out.println("Execute something post-processing");
    }
}
