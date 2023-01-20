package com.lw.tech.mytestapp;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/lw")
public class LWHelloApp {

    /*
    public  static  void main(String args[]){
        System.out.println( lwsum() );
    }*/

    // call you from network : client : http : method GET : expose

    // /sum : route / path / endpoint : URL
    // requested method GET :  http://ip:port/sum  : URL : endpoint


    // resteasy : library / extension for quarkus
    @Path("/sum")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public int lwsum() {
        return 5 + 2;
    }

    @Path("/hi")
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String sayhi(){
        return "Hi LW";
    }

}