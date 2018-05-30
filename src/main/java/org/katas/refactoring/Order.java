package org.katas.refactoring;

import java.util.List;

public class Order {
    private Customer customer;
    List<LineItem> lineItems;

    public Order(Customer customer, List<LineItem> lineItems) {
        this.customer = customer;
        this.lineItems = lineItems;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public String getCustomerAddress() {
        return customer.getAddress();
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    String getCustomerInfo() {
        return getCustomerName()+getCustomerAddress();
    }
}
