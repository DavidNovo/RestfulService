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
        newCustomer.setName("David");

        return newCustomer;
    }

    @Override
    public void addCustomer(Customer customer) {

    }
}
