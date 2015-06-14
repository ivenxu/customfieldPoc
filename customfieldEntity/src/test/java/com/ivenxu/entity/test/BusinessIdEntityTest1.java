package com.ivenxu.entity.test;

import com.ivenxu.entitybasic.BusinessIdEntity;
import java.io.Serializable;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author xui
 */
@Entity
public class BusinessIdEntityTest1 extends BusinessIdEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    
    public BusinessIdEntityTest1(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
    
}
