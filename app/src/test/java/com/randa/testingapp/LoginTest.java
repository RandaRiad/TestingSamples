package com.randa.testingapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class LoginTest {

    Login login;

    @Before
    public void setUp() throws Exception {
        login=new Login();
        System.out.println(" Before Login");
    }

    @After
    public void after(){
        System.out.println("after Login");
    }
    @Test

    public void check() {
        login.setName("rrr");
        assertFalse(login.check());
    }

}