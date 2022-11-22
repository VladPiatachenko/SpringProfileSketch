package sumdu.edu.ua.spring.model;

import java.util.Date;

public class Person {
	private String name;
        private String surname;
        private String email;
        private Date time;

    public Person(String name, String surname, String email, Date time) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

	
}
