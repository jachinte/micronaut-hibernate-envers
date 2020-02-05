package com.example.myservice.domain;

import lombok.Data;
import org.hibernate.envers.RevisionEntity;
import org.hibernate.envers.RevisionNumber;
import org.hibernate.envers.RevisionTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@RevisionEntity(CustomRevisionListener.class)
@Table(
    catalog = "mycatalog",
    name = "revisions",
    schema = "myschema"
)
public class CustomRevision {

    private static final long serialVersionUID = -2370764225234936349L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @RevisionNumber
    private @NotNull int id;

    @RevisionTimestamp
    private @NotNull long timestamp;

    @Column(name = "user_id")
    private @NotNull String user;

}
