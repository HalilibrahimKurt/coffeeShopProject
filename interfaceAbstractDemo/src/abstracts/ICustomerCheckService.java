package abstracts;

import java.rmi.RemoteException;

import entities.Customer;

public interface ICustomerCheckService {
	boolean checkIfRealPerson(Customer customer) throws RemoteException;
}
