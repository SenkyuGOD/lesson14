package edu.traning.lesson14.customer;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<Customer> customers = new ArrayList<Customer>();

    public Bank() {
    }

    public void add(Customer customer) {
        customers.add(customer);
    }

    public void sortCustomersByName() {
        for (int i = 0; i < customers.size(); i++) {
            Customer current = customers.get(i);
            int index = i;

            for (int j = i + 1; j < customers.size(); j++) {
                String name1 = current.getSurname();
                String name2 = customers.get(j).getSurname();

                if (name2.compareTo(name1) < 0) {
                    current = customers.get(j);
                    index = j;
                }
            }

            customers.set(index, customers.get(i));
            customers.set(i, current);

        }

    }

    public List<Customer> findByCard(String numberFrom, String numberTo) {
        List<Customer> result = new ArrayList<>();

        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);

            if (customer.getNumOfCreditCard().compareTo(numberFrom) > 0 && customer.getNumOfCreditCard().compareTo(numberTo) < 0) {
                result.add(customer);
            }
        }
        return result;
    }

    public void print(){
        for (Customer customer: customers){
            System.out.println(customer.toString());
        }
    }
}
