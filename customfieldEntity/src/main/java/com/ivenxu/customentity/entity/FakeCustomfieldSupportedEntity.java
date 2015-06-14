
package com.ivenxu.customentity.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author xui
 */
@Entity
public  class FakeCustomfieldSupportedEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
//    private String name;
    
    
    @Embedded
//    @AssociationOverrides({
//    @AssociationOverride(name="customfields",
//    joinColumns=@JoinColumn(name="INSTANCE_ID", referencedColumnName="ID"))})
    private CustomfieldInfo customfieldInfo;
    
//    @OneToMany
//    @MapKeyColumn(name="CUSTFLD_DEF_ID")
//    @JoinColumn(name="CustomfieldValue", referencedColumnName="ID")
//    private Map<CustomfieldDefinition, CustomfieldValue> customfields;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    
}
