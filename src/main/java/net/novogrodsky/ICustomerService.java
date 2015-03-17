package net.novogrodsky;

import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * Created by davidnovogrodsky_wrk on 3/16/15.
 */
@Path("/customer")
interface ICustomerService {
    @GET
    @Description(value = "resource", target = DocTarget.RESOURCE)
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN, MediaType.APPLICATION_XML })
    @Path("/getdetails/{name}")
    public Customer getCustomerDetails (@Description("Customer name") @PathParam("name") final String name);

    public void addCustomer (Customer customer);
}
