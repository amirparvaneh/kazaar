package com.kazaar.demo.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Permission extends BaseEntity{

    @Column(name = "permission_title")
    @JsonProperty("title")
    private String title;
}
