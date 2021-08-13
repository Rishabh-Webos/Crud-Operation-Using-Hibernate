package com.model;

public class Address {
  int id;
  String city, street;

  public String getStreet() {
    return street;
  }

  public void setStreet(String street) {
    this.street = street;
  }

  public int getId() {
    return id;
  }

  public void setId(int addressId) {
    this.id = addressId;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  @Override
  public String toString() {
    return "Address [id=" + id + ", city=" + city + ", street=" + street + "]";
  }
}
