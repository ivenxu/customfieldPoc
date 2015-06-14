/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.entitybasic;

import com.ivenxu.customentity.entity.CustomfieldDefinition;
import com.ivenxu.customentity.entity.CustomfieldValue;
import com.ivenxu.customentity.entity.CustomfieldValueId;
import com.ivenxu.customentity.entity.EntityMetadata;
import com.ivenxu.entity.test.CustomfieldSupportedEntity1;
import java.util.HashSet;
import java.util.Set;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author xui
 */
public class CustomfieldSupportedEntityTest extends BaseEntityTest {
     @Test
     public void crud() {
         CustomfieldSupportedEntity1 target = new CustomfieldSupportedEntity1();
         target.setName("Hello");
         EntityMetadata meta = new EntityMetadata();
         meta.setEntityName("CustomfieldSupportedEntity1");
         CustomfieldDefinition custfldDef = new CustomfieldDefinition();
         custfldDef.setEntityMetadata(meta);
         custfldDef.setActive(Boolean.TRUE);
         custfldDef.setDisplayName("Field1");
         custfldDef.setFieldType("String");
         custfldDef.setIndex(1);
         CustomfieldValue custValue = new CustomfieldValue();
         custValue.setValue("100");
         custValue.setCustomfieldDefinition(custfldDef);
         target.getCustomfieldInfo().getCustomfields().put(custfldDef, custValue);
         em.persist(target);
         em.persist(meta);
         em.persist(custfldDef);
         em.persist(custValue);
//         et.commit();
//         et.begin();
         CustomfieldSupportedEntity1 getEntity = em.find(CustomfieldSupportedEntity1.class, target.getId());
         assertEquals(getEntity.getCustomfieldInfo().getCustomfields().get(custfldDef), custValue);
         getEntity.getCustomfieldInfo().getCustomfields().get(custfldDef).setValue("200");
         CustomfieldValue custfldValueGet = em.find(CustomfieldValue.class, 
                 new CustomfieldValueId(custValue.getId().getUuid(), custValue.getId().getInstanceId(), custValue.getId().getCustomfieldDefinitionId()));
         assertEquals(custfldValueGet, custValue);
         em.remove(custfldValueGet);
         em.remove(custfldDef);
         em.remove(meta);
         em.remove(target);
         et.commit();
         
     }
}
