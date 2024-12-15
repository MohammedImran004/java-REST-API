package com.imran.rest.com.imran.rest.webservices.restful_web_services.Versioning;

public class PersonV2 {
    private Name name;

    public PersonV2(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PersonV2{");
        sb.append("name=").append(name);
        sb.append('}');
        return sb.toString();
    }
    
}
