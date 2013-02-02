package com.aymen.rest.service;

import com.aymen.rest.model.Customer;
import com.aymen.rest.repository.CustomerRepository;
import com.aymen.rest.repository.CustomerRepositoryImpl;

import javax.ws.rs.*;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 2/2/13
 * Time: 11:05 AM
 * To change this template use File | Settings | File Templates.
 */
@Path("/customerService")
@Produces("application/json")
public class CustomerServiceImpl implements CustomerService {

    private CustomerRepository repository;

    @POST
    @Path("/customer")
    @Consumes(value = "application/json")
    @Produces(value = "application/json")
    @Override
    public void createCustomer(String id, String firstName, String lastName) {
        Customer c = new Customer();
        c.setId(id);
        c.setFirstName(firstName);
        c.setLastName(lastName);
        repository.addCustomer(c);
    }

    @GET
    @Path("/customer/{id}")
    @Produces("application/json")
    @Override
    public Customer getCustomer(@PathParam("id") String id) {
        return repository.getCustomerDetails(id);
    }

    public void setRepository(CustomerRepository repository) {
        this.repository = repository;
    }
}
