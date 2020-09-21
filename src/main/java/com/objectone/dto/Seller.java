package com.objectone.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

public class Supplier {
    private String firstName;
    private String lastName;
    private String distributorId;

    public Supplier() {
    }

    public Supplier(String firstName, String lastName, String distributorId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.distributorId = distributorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(String distributorId) {
        this.distributorId = distributorId;
    }
}
