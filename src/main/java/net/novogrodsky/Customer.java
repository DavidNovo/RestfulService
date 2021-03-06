/**
 * Created by davidnovogrodsky_wrk on 3/16/15.
 */
package net.novogrodsky;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {
    private String name;
    private String address;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
