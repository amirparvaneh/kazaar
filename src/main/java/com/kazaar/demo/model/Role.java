package com.kazaar.demo.model;


import jakarta.persistence.*;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "role")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Role extends BaseEntity{

    @Column(name = "role_title")
    private String title;


    @OneToMany
    @JoinColumn(name = "role_id")
    private List<User> users;


    @ManyToMany
    @JoinTable(
            name = "role_permission",
            joinColumns = @JoinColumn(name = "role_ID"),
            inverseJoinColumns = @JoinColumn(name = "permission_ID"))
    private List<Permission> permission;
}
