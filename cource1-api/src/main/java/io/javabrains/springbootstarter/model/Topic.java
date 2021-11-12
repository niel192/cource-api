package io.javabrains.springbootstarter.model;

public class Topic {

    private String id;
    private String fname;
    private String lname;
    private String address;

    public Topic(){

    }

    public Topic(String id, String fname, String lname, String address) {
        super();
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.address = address;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getAddress() {
        return address;
    }
}
