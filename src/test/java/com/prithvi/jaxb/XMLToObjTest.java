package com.prithvi.jaxb;

import org.junit.Test;

import java.io.File;
import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: prithvi
 * Date: 1/27/12
 * Time: 4:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLToObjTest {

      @Test
    public void testUNMasrshal() throws Exception {
        XMLToObj.unmarshal(new File("data/student.xml"));
    }
}