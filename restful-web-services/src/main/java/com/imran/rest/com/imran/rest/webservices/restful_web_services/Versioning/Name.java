package com.imran.rest.com.imran.rest.webservices.restful_web_services.Versioning;

public class Name {
    private String Firstname;
    private String Lastname;
    public Name(String firstname, String lastname) {
        Firstname = firstname;
        Lastname = lastname;
    }
    public String getFirstname() {
        return Firstname;
    }
    public String getLastname() {
        return Lastname;
    }
    @Override
    public String toString() {
        return "Name [Firstname=" + Firstname + ", Lastname=" + Lastname + "]";
    }
    
}
