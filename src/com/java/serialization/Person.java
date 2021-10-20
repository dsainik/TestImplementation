package com.java.serialization;

import java.io.Serializable;

public class Person implements Serializable{

     /**
     * 
     */
    private static final long serialVersionUID = 1558783819783256176L;
    String name;
    String country;
    transient int ssn;
    Address add;
    
    
     
    public Address getAdd() {
        return add;
    }
    public void setAdd(Address add) {
        this.add = add;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public int getSsn() {
        return ssn;
    }
    public void setSsn(int ssn) {
        this.ssn = ssn;
    }
     
     
     
}
