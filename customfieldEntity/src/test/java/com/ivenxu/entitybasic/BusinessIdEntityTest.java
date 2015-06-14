/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.entitybasic;

import com.ivenxu.entity.test.BusinessIdEntityTest1;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author xui
 */
public class BusinessIdEntityTest extends BaseEntityTest {
    
    
    public BusinessIdEntityTest() {
    }
    


     @Test
     public void crud() {
         BusinessIdEntityTest1 entity = new BusinessIdEntityTest1();
         entity.setName("hello");
         em.persist(entity);
         assertTrue(entity.getId() > 0);
         BusinessIdEntityTest1 get = em.find(BusinessIdEntityTest1.class, entity.getId());
         assertEquals(entity.getId(), get.getId());
         assertEquals(entity.getName(), get.getName());
         assertEquals(entity.getUuid(), get.getUuid());
         get.setName(get.getName() + "ok");
         em.persist(get);
         BusinessIdEntityTest1 get2 = em.find(BusinessIdEntityTest1.class, entity.getId());
         assertEquals(get2.getName(), get.getName());
         em.remove(get2);
         et.commit();
     }
}
