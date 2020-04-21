package it.xpug.ocp.customerbase;
import java.util.*;


public class CustomerBase {

	private List<Customer> customers = new ArrayList<Customer>();
	private IUserFinder userFinder = null;

	public void add(Customer customer) {
		customers.add(customer);
	}

	public List<Customer> findBy(Customer customer, String parameters){
		if(parameters == "firstName")
			userFinder = new UserFinderByFirstName();
		if(parameters == "lastName")
			userFinder = new UserFinderByLastName();
		return userFinder.search(customer, this.customers);
	}


	public List<Customer> findByFirstAndLastName(String firstName, String lastName) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.firstName().equals(firstName) && customer.lastName().equals(lastName) ) {
				result.add(customer);
			}
		}
		return result;
	}

	public List<Customer> findByCreditGreaterThan(int credit) {
		List<Customer> result = new ArrayList<Customer>();
		for (Customer customer : customers) {
			if (customer.credit() > credit) {
				result.add(customer);
			}
		}
		return result;
	}

}
