package dev.ifeoluwa.customer.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author on 25/10/2022
 * @project
 */

@Data
@Builder
public class Customer {
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
