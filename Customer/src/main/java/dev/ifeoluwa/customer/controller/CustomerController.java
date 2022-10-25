package dev.ifeoluwa.customer.controller;

import dev.ifeoluwa.customer.model.CustomerRegistrationRequest;
import dev.ifeoluwa.customer.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author on 25/10/2022
 * @project
 */
@Slf4j
@RestController
@RequestMapping("api/v1/customers")
public record CustomerController(CustomerService customerService) {


    public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
        log.info("new customer registration {}", customerRegistrationRequest);
        customerService.register(customerRegistrationRequest);
    }
}
