package net.novogrodsky;

import org.springframework.stereotype.Component;

/**
 * Created by davidnovogrodsky_wrk on 3/16/15.
 */
@Component("customerService")
public class CustomerServiceImpl implements ICustomerService {
    @Override
    public Customer getCustomerDetails(String name) {
        Customer newCustomer = new Customer();
        newCustomer.setAddress("San Antonio");
        newCustomer.setAge(34);
        newCustomer.setName(name);

        return newCustomer;
    }

    @Override
    public GenericResponse addCustomer(Customer customer) {
        GenericResponse response = new GenericResponse();

        if (customer != null && customer.getAge() > 20) {
            response.setMessage("Customer added");
            response.setSuccess(true);

        } else {
            response.setMessage("Customer to young to be added");
            response.setSuccess(false);
        }
        return response;
    }
}
