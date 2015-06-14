/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.customentity.entity;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.*;


/**
 *
 * @author xui
 */
@Entity
@Table(name="CUSTOMFIELD_VALUE")
public class CustomfieldValue implements Serializable{
    @EmbeddedId
    private CustomfieldValueId id = new CustomfieldValueId();
    @Column(name="CUSTFLD_VALUE")
    private String value;
    @MapsId("customfieldDefinitionId")
    @ManyToOne
    @JoinColumn(name="CUSTFLD_DEF_ID")
    private CustomfieldDefinition customfieldDefinition;
    
    public CustomfieldValue(){}
    public CustomfieldValue(UUID uuid, long instanceId, long customfieldDefinitionId){
        id = new CustomfieldValueId(uuid, instanceId, customfieldDefinitionId);
    }


    /**
     * @return the customfieldValueId
     */
    public CustomfieldValueId getId() {
        return id;
    }


    /**
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * @return the customfieldDefinition
     */
    public CustomfieldDefinition getCustomfieldDefinition() {
        return customfieldDefinition;
    }

    /**
     * @param customfieldDefinition the customfieldDefinition to set
     */
    public void setCustomfieldDefinition(CustomfieldDefinition customfieldDefinition) {
        this.customfieldDefinition = customfieldDefinition;
    }

    
}
