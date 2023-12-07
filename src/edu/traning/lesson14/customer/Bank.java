package edu.traning.lesson14.customer;

import java.util.*;

public class Bank {

    private List<Customer> customers = new ArrayList<Customer>();

    public Bank() {
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void sortCustomers() {
        Collections.sort(customers, Comparator.comparing(Customer::getSurname));
    }



}
