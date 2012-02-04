package com.prithvi.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: prithvi
 * Date: 1/27/12
 * Time: 3:42 PM
 * To change this template use File | Settings | File Templates.
 */

@XmlRootElement
public class Student {

    private BigInteger id;
    private String Name;
    private int Age;
    private String favoriteSubject;

    public String getName() {
        return Name;
    }

    @XmlElement
    public void setName(String name) {
        Name = name;
    }

    public BigInteger getId() {
        return id;
    }

    @XmlAttribute
    public void setId(BigInteger id) {
        this.id = id;
    }

    public int getAge() {
        return Age;

    }

    @XmlElement
    public void setAge(int age) {
        Age = age;
    }

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    @XmlElement
    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    @Override
    public String toString(){

          return getId()+","+getName()+","+getAge() +","+getFavoriteSubject();
    }

}
