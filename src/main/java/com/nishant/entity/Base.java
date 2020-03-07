package com.nishant.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.Instant;

@Data
@MappedSuperclass
public class Base {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Instant createdAt;

    private Instant updatedAt;

    private Long createdBy;

    private Long updatedBy;

    private Boolean deleted;

    @PrePersist
    public void logCreate(){
        this.createdAt=this.updatedAt = Instant.now();
        this.createdBy=this.updatedBy=1l;
    }

    @PreUpdate
    public void logUpdate(){
        this.updatedAt = Instant.now();
        this.updatedBy=1l;
    }
}
