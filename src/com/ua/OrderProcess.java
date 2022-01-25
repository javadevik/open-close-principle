package com.ua;

import com.ua.model.Order;
import com.ua.repos.OrderRepository;

public class OrderProcess {
    public void process(Order order) {
        Repository repository = new OrderRepository();
        if (order.isValid() && repository.save(order)) {
            Sender sender = new ConfirmationGmailSender();
            sender.send();
            System.out.println("Confirmation email was send");
        }
    }
}
