/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.customentity.entity;

import com.ivenxu.entitybasic.BusinessIdEntity;
import java.io.Serializable;
import javax.persistence.*;


/**
 *
 * @author xui
 */
@Entity
@Table(name="CUSTOMFIELD_VALUE")
public class CustomfieldValue implements Serializable{
    @EmbeddedId
    private CustomfieldValueId customfieldValueId = new CustomfieldValueId();
    @Column(name="CUSTFLD_VALUE")
    private String value;
    @MapsId("customfieldDefinitionId")
    @ManyToOne
    @JoinColumn(name="CUSTFLD_DEF_ID")
    private CustomfieldDefinition customfieldDefinition;
    
    public CustomfieldValue(){}
    public CustomfieldValue(long subId, long instanceId, long customfieldDefinitionId){
        customfieldValueId = new CustomfieldValueId(subId, instanceId, customfieldDefinitionId);
    }
//    @MapsId("instanceId")
//    @ManyToOne
//    @JoinColumn(name="INSTANCE_ID")
//    private CustomfieldInfo customfieldInfo;
    
//    @MapsId("instanceId")
//    @ManyToOne
//    @JoinColumn(name="INSTANCE_ID")
//    private FakeCustomfieldSupportedEntity customfieldInfo;

    /**
     * @return the customfieldValueId
     */
    public CustomfieldValueId getCustomfieldValueId() {
        return customfieldValueId;
    }

    /**
     * @param customfieldValueId the customfieldValueId to set
     */
    public void setCustomfieldValueId(CustomfieldValueId customfieldValueId) {
        this.customfieldValueId = customfieldValueId;
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
