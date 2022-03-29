package com.pack.pojo;

import javax.persistence.*;

@Entity
public class Employee
{
    @Id
    @Column(name = "id" , columnDefinition="int default '1'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id=1l;
    @Column(name ="name")
    private String name;
    @Column(name="email")
    private String email;
    @Column(name ="department")
    private String department;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + " , department="
                + department + "]";
    }

}
