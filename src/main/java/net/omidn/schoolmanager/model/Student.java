package net.omidn.schoolmanager.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Student {

    @Id
    private int id;


    private Gender gender;



    private String firstName;



    private String middleName;



    private String laseName;


    private Date dateOfBirth;

}
