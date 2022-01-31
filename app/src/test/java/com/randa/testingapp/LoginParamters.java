package com.randa.testingapp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class LoginParamters {

    private int first,second,result;

    Login login;

    public LoginParamters(int first, int second, int result) {
        this.first = first;
        this.second = second;
        this.result = result;
        this.login =new Login();
    }

    @Parameterized.Parameters
    public static Integer [][] data(){
        return new Integer[][]{
                {1,1,2},
                {2,2,4},
                {3,3,6}
        };
    }


    @Test
    public void checkResult(){
        assertEquals(result,login.sum(first,second));

    }

}
