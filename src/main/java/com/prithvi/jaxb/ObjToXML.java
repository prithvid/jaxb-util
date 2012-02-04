package com.prithvi.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: prithvi
 * Date: 1/27/10001
 * Time: 3:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class ObjToXML {

    public static void masrshal(Student student) {
        File file = new File("target/Student.xml");
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Student.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(student, file);
            marshaller.marshal(student, System.out);
        } catch (JAXBException je) {
            je.printStackTrace();
        }

    }


}


