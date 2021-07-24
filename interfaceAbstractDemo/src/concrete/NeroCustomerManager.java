package concrete;

import abstracts.BaseCustomerManager;
import abstracts.ICustomerCheckService;
import entities.Customer;


public class NeroCustomerManager extends BaseCustomerManager{
	
	private ICustomerCheckService customerCheckService;

	public NeroCustomerManager(ICustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		try {
			if (customerCheckService.checkIfRealPerson(customer)) {
				super.save(customer);
			}
		} catch (Exception e) {
			System.out.println("Not a valid person");
			
		}
	}

}
