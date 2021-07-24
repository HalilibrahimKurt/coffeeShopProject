package adapters;

import java.rmi.RemoteException;

import abstracts.ICustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) throws RemoteException {
		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		return kpsPublicSoapProxy.TCKimlikNoDogrula(customer.nationalityId, customer.firstName.toUpperCase(), customer.lastName.toUpperCase(), customer.dateOfBirth);
		
	}
}
