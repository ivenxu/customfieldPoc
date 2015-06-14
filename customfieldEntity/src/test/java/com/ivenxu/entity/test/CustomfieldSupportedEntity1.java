
package com.ivenxu.entity.test;

import com.ivenxu.customentity.entity.*;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import javax.persistence.*;


/**
 *
 * @author xui
 */
@Entity
public class CustomfieldSupportedEntity1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String name;
    
    
    @Embedded
    private CustomfieldInfo customfieldInfo;

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

    /**
     * @return the customfieldInfo
     */
    public CustomfieldInfo getCustomfieldInfo() {
        if (customfieldInfo == null){
            customfieldInfo = new CustomfieldInfo();
        }
        return customfieldInfo;
    }

    /**
     * @param customfieldInfo the customfieldInfo to set
     */
    public void setCustomfieldInfo(CustomfieldInfo customfieldInfo) {
        this.customfieldInfo = customfieldInfo;
    }

    
}
