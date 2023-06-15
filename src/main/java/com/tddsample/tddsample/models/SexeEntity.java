package com.tddsample.tddsample.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
import java.util.Set;

@Entity
@Data
@Table(name = "sexe", schema = "tddsample", catalog = "")
public class SexeEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "idsexe")
    private int idsexe;
    @Basic
    @Column(name = "homme")
    private String homme;
    @Basic
    @Column(name = "femme")
    private String femme;

    @OneToMany (cascade = CascadeType.ALL)
    private Set<UsersEntity> usersEntities;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SexeEntity that = (SexeEntity) o;
        return idsexe == that.idsexe && Objects.equals(homme, that.homme) && Objects.equals(femme, that.femme);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsexe, homme, femme);
    }
}
