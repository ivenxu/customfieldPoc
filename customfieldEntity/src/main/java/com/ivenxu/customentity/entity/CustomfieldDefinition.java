package com.ivenxu.customentity.entity;

import com.ivenxu.entitybasic.BusinessIdEntity;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;


/**
 *
 * @author xui
 */
@Entity
@Table(name="CUSTOMFIELD_DEF")
public class CustomfieldDefinition extends BusinessIdEntity  implements Serializable{
    @Id
     @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="DISPLAYNAME")
    private String displayName;
//    private FieldLocation fieldLocation;
    @Column(name="CUSTFLD_TYPE")
    private String fieldType;
    private Boolean active;
    @Column(name="CUSTFLD_INDEX")
    private int index;
    @ManyToOne
    @JoinColumn(name="ENTITYMeTA_ID")
    private EntityMetadata entityMetadata;

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * @param displayName the displayName to set
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * @return the fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    /**
     * @param fieldType the fieldType to set
     */
    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    /**
     * @return the active
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * @param active the active to set
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    /**
     * @return the index
     */
    public int getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(int index) {
        this.index = index;
    }

    /**
     * @return the entityMetadata
     */
    public EntityMetadata getEntityMetadata() {
        return entityMetadata;
    }

    /**
     * @param entityMetadata the entityMatadata to set
     */
    public void setEntityMetadata(EntityMetadata entityMetadata) {
        this.entityMetadata = entityMetadata;
    }

    
    public enum FieldLocation{
        Embedded,
        Seperated
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
