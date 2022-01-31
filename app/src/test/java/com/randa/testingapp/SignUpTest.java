package com.randa.testingapp;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SignUpTest {

    SignUp signUp;

    @Before
    public void setUp() throws Exception {
        signUp=new SignUp();
        System.out.println("before Sign up");
    }
    @After
    public void after(){
        System.out.println("after Sigunup");
    }
    @Test

    @Category(GoodTest.class)
    public void checkName() {
        signUp.setName("tt");
        assertNotNull(signUp.check());
    }


}