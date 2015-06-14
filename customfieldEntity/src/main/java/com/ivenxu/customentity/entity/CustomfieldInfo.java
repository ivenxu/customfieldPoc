
package com.ivenxu.customentity.entity;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author xui
 */
@Embeddable @Access(AccessType.FIELD)
public class CustomfieldInfo implements Serializable{
//    private String entityName;
//    private String reservedField1;
//    private String reservedField2;
//    private String reservedField3;
//    private String reservedField4;
//    private String reservedField5;
//    @OneToMany
//    private List<CustomfieldDefinition> customfieldDefinitions;
//    @OneToMany
//    private List<CustomfieldValue> customfieldValues;

    
    @OneToMany
    @MapKeyJoinColumn(name="CUSTFLD_DEF_ID")
    @JoinColumn(name="INSTANCE_ID")
    private Map<CustomfieldDefinition, CustomfieldValue> customfields;
    
//        @OneToMany()
//    @JoinColumn(name="INSTANCE_ID", referencedColumnName="ID")
//    private Set<CustomfieldValue> customfields;
    
    public CustomfieldInfo(){
//        super();
//        entityName = this.getClass().getSimpleName();
    }

    /**
     * @return the customfields
     */
    public Map<CustomfieldDefinition, CustomfieldValue> getCustomfields() {
        if (customfields == null) {
            customfields = new HashMap<>();
        }
        return customfields;
    }

    /**
     * @param customfields the customfields to set
     */
    public void setCustomfields(Map<CustomfieldDefinition, CustomfieldValue> customfields) {
        this.customfields = customfields;
    }
}
