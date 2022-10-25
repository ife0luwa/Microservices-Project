package dev.ifeoluwa.customer.model;

/**
 * @author on 25/10/2022
 * @project
 */
public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
