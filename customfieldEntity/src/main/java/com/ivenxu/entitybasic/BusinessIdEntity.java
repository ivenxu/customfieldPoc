
package com.ivenxu.entitybasic;

import java.io.Serializable;
import java.util.UUID;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author xui
 */
@MappedSuperclass
public abstract class BusinessIdEntity  implements Serializable{
    private UUID uuid;
    
    public BusinessIdEntity(){
        uuid = UUID.randomUUID();
    }
    
    @Override
    public int hashCode() {
        return getUuid().hashCode();
    }

    @Override
    /**
    *
    * Determine whether two objects are equal.
    * 
    * According the algorithm of UUID. "The chance of a collision in values is effectively nil."
    * Therefore we can rely on comparing on UUID even crossing Entity types.
    */
    public boolean equals(final Object obj) {
        if (this == obj)
            return true;
        if (!(obj instanceof BusinessIdEntity))
            return false;
        return getUuid().equals(((BusinessIdEntity) obj).getUuid());
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "UUID[" + this.getUuid().toString() +"]";
    }

    /**
     * @return the uuid
     */
    public UUID getUuid() {
        return uuid;
    }
    
    
}
