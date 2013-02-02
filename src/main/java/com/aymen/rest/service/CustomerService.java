package com.aymen.rest.service;

import com.aymen.rest.model.Customer;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 2/2/13
 * Time: 11:04 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerService {

    void createCustomer(String id, String firstName, String lastName);

    Customer getCustomer(String id);
}
