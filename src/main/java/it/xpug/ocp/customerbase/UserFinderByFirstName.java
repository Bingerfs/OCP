package it.xpug.ocp.customerbase;

import java.util.ArrayList;
import java.util.List;

/**
 * UserFinderByFirstName
 */
public class UserFinderByFirstName implements IUserFinder {

    @Override
    public List<Customer> search(Customer customer, List<Customer> customers) {
        List<Customer> result = new ArrayList<Customer>();
		for (Customer customerInList : customers) {
			if (customerInList.lastName().equals(customer.firstName())) {
				result.add(customerInList);
			}
		}
		return result;

    }

    
}