/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ivenxu.entitybasic;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import org.junit.*;

/**
 *
 * @author xui
 */
public abstract class BaseEntityTest {

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }
    protected EntityManager em;
    protected EntityTransaction et;

    public BaseEntityTest() {
    }

    @Before
    public void setUp() {
        em = Persistence.createEntityManagerFactory("customEntityTest").createEntityManager();
        et = em.getTransaction();
        et.begin();
    }

    @After
    public void tearDown() {
        if (et.isActive()) {
            et.rollback();
        }
        if (em.isOpen()) {
            em.close();
        }
    }
    
}
