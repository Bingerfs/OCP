package it.xpug.ocp.customerbase;

import java.util.List;

public interface IUserFinder {
    List<Customer> search(Customer customer, List<Customer> customers);

}