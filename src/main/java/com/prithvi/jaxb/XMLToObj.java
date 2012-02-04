package com.prithvi.jaxb;

import com.sun.jmx.remote.internal.Unmarshal;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: prithvi
 * Date: 1/27/12
 * Time: 4:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class XMLToObj {

    public static void unmarshal(File file){

        try {
            JAXBContext jaxbContext= JAXBContext.newInstance(Student.class);
             Unmarshaller unmarshaller= jaxbContext.createUnmarshaller();
              Student student =(Student) unmarshaller.unmarshal(file);
            System.out.println(student);

        } catch (JAXBException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

    }
}
