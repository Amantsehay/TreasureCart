package com.carttreasure.pearl.models;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

import static jakarta.persistence.TemporalType.TIMESTAMP;


//@Data // this is a Lombok annotation to create some
@MappedSuperclass // this is a JPA annotation to tell JPA that this class is not to be mapped to a data entity
@EntityListeners(AuditingEntityListener.class) // this is a JPA annotation to tell JPA that this class is to be listened to for auditing purposes
//When something happens to this class, JPA will listen to it and record the changes in the database
public abstract class Auditable<U> {

    @CreatedBy // who created the record
    protected U createdBy;

    @CreatedDate // when the record was created
    @Temporal(TIMESTAMP) // this is a JPA annotation to tell JPA that this field is of type TIMESTAMP
    // What the hell is timestamp? It is a date and time format
    protected Date createdDate;

    @LastModifiedBy
    protected U lastModifiedBy;

    @LastModifiedDate
    @Temporal(TIMESTAMP)
    protected Date lastModifiedDate;

    public void setCreatedBy(U createdBy) {
        this.createdBy = createdBy;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public void setLastModifiedBy(U lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }
}