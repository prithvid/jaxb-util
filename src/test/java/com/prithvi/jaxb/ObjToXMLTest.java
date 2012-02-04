package com.prithvi.jaxb;

import org.junit.Test;

import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: prithvi
 * Date: 1/27/12
 * Time: 4:24 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObjToXMLTest {
    @Test
    public void testMasrshal() throws Exception {
        Student student = new Student();
        student.setId(new BigInteger("10001"));
        student.setName("luke skywalker");
        student.setAge(21);
        student.setFavoriteSubject("Math");
        ObjToXML.masrshal(student);
    }
}
