/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.customentity.entity;

import com.ivenxu.entitybasic.BusinessIdEntity;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author xui
 */
@Entity
@Table(name="ENTITY_METADATA")
public class EntityMetadata extends BusinessIdEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String entityName;

    public Long getId() {
        return id;
    }


    /**
     * @return the entityName
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * @param entityName the entityName to set
     */
    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }
    
}
