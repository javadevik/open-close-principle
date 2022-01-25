package com.ua;

import com.ua.model.Order;

public interface Repository {
    boolean save(Order order);
}
