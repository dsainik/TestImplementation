package com.java.serialization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Address implements Externalizable{
  String street;
  String pincode;
public String getStreet() {
    return street;
}
public void setStreet(String street) {
    this.street = street;
}
public String getPincode() {
    return pincode;
}
public void setPincode(String pincode) {
    this.pincode = pincode;
}
@Override
public void writeExternal(ObjectOutput out) throws IOException {
    // TODO Auto-generated method stub
    
}
@Override
public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
    // TODO Auto-generated method stub
    
}
  
  
}
