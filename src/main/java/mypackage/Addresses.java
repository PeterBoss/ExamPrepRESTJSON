/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Peter
 */
@Path("addresses")
public class Addresses {

    DataGenerator dataGen = new DataGenerator();

    @Context
    private UriInfo context;

    public Addresses() {
    }

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public String getXml(int i, String s) {
        return dataGen.getData(i, s);
    }

}
