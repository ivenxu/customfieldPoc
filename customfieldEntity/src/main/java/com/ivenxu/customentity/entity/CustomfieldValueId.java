
package com.ivenxu.customentity.entity;

import com.ivenxu.entitybasic.BusinessIdEntity;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

/**
 *
 * @author xui
 */
@Embeddable
public class CustomfieldValueId extends BusinessIdEntity implements Serializable {
    @Column(name="INSTANCE_ID")
    private long instanceId;
    @Column(name="CUSTFLD_DEF_ID")
    private long customfieldDefinitionId;
    
    public CustomfieldValueId(){}
    public CustomfieldValueId(UUID uuid, long instanceId, long customfieldDefinitionId){
        super();
        this.instanceId = instanceId;
        this.customfieldDefinitionId = customfieldDefinitionId;
        this.setUuid(uuid);
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof CustomfieldValueId))
            return false;
        
        CustomfieldValueId other = (CustomfieldValueId)obj;
        return (other.getUuid() == this.getUuid()) 
                && (other.getInstanceId() == instanceId) 
                && (other.getCustomfieldDefinitionId() == customfieldDefinitionId);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.getUuid().hashCode() ^ (this.getUuid().hashCode() >>> 32));
        hash = 97 * hash + (int) (this.instanceId ^ (this.instanceId >>> 32));
        hash = 97 * hash + (int) (this.customfieldDefinitionId ^ (this.customfieldDefinitionId >>> 32));
        return hash;
    }


    /**
     * @return the instanceId
     */
    public long getInstanceId() {
        return instanceId;
    }

    /**
     * @param entityInstanceId the instanceId to set
     */
    public void setInstanceId(long instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * @return the customfieldDefinitionId
     */
    public long getCustomfieldDefinitionId() {
        return customfieldDefinitionId;
    }

    /**
     * @param customfieldDefinitionId the customfieldDefinitionId to set
     */
    public void setCustomfieldDefinitionId(long customfieldDefinitionId) {
        this.customfieldDefinitionId = customfieldDefinitionId;
    }
}
