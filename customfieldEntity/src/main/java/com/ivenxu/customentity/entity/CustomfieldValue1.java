/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.customentity.entity;

import com.ivenxu.entitybasic.BusinessIdEntity;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author xui
 */
@Entity
public class CustomfieldValue1 extends BusinessIdEntity implements Serializable{
    @Id
    private Long id;
    
//    @ManyToOne
//    @JoinColumn(name="INSTANCE_ID")
//    private FakeCustomfieldSupportedEntity entityInstance;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    
}
