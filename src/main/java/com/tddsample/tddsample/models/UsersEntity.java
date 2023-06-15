package com.tddsample.tddsample.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Data
@Entity
@Table(name = "users", schema = "tddsample", catalog = "")
public class UsersEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idusers")
    private int idusers;
    @Basic
    @Column(name = "userscol")
    private String userscol;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "lastname")
    private String lastname;
    @Basic
    @Column(name = "phonenumber")
    private String phonenumber;
    @Basic
    @Column(name = "birthday")
    private String birthday;
    @Basic
    @Column(name = "is_active")
    private String isActive;






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsersEntity that = (UsersEntity) o;
        return idusers == that.idusers && Objects.equals(userscol, that.userscol) && Objects.equals(name, that.name) && Objects.equals(lastname, that.lastname) && Objects.equals(phonenumber, that.phonenumber) && Objects.equals(birthday, that.birthday) && Objects.equals(isActive, that.isActive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idusers, userscol, name, lastname, phonenumber, birthday, isActive);
    }
}
