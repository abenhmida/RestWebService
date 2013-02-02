package com.aymen.rest.repository;

import com.aymen.rest.model.Customer;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 2/2/13
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public interface CustomerRepository {

    Customer getCustomerDetails(String id);

    void addCustomer(Customer customer);

}
