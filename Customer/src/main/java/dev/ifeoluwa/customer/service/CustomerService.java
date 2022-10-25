package dev.ifeoluwa.customer.service;

import dev.ifeoluwa.customer.model.Customer;
import dev.ifeoluwa.customer.model.CustomerRegistrationRequest;
import org.springframework.stereotype.Service;

/**
 * @author on 25/10/2022
 * @project
 */
@Service
public record CustomerService() {
    public void register(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        //todo: check if email is valid
        //todo: check if email is taken
        //todo: store customer in db
    }
}
