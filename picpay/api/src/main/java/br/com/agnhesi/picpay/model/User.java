package br.com.agnhesi.picpay.model;
/*
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name = "user")
public class User {

    @Id
    @Column(length = 36)
    private String id;

    @Column(length = 200)
    private String name;

    @Column(length = 100)
    private String username;

    @OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id", nullable = true)
    @JsonIgnore
    private FirstPriority firstPriority;

    @OneToOne(fetch = FetchType.LAZY, optional = true)
    @JoinColumn(name = "id", nullable = true)
    @JsonIgnore
    private SecondPriority secondPriority;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public FirstPriority getFirstPriority() {
        return firstPriority;
    }

    public void setFirstPriority(FirstPriority firstPriority) {
        this.firstPriority = firstPriority;
    }

    public SecondPriority getSecondPriority() {
        return secondPriority;
    }

    public void setSecondPriority(SecondPriority secondPriority) {
        this.secondPriority = secondPriority;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        User other = (User) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
}*/