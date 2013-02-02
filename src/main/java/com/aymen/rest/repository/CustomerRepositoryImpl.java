package com.aymen.rest.repository;

import com.aymen.rest.model.Customer;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 2/2/13
 * Time: 10:53 AM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerRepositoryImpl implements CustomerRepository {

    ObjectMapper mapper = new ObjectMapper();

    @Override
    public Customer getCustomerDetails(String id) {
        try {
            System.out.println(mapper.readValue(new File("customer.json"), Customer.class));
            return mapper.readValue(new File("customer.json"), Customer.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void addCustomer(Customer customer) {
        try {
            mapper.writeValue(new File("customer.json"), customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
