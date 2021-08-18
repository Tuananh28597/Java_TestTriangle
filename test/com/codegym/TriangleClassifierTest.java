package com.codegym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void test222() {
        int a = 2;
        int b = 2;
        int c = 2;
        String expect = "tam giác đều";
        String result = TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
    }
     @Test
    void test223(){
        int a=2;
        int b=2;
        int c=3;
        String expect= "tam giác cân";
        String result= TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);

     }

     @Test
    void test345(){
        int a=3;
        int b=4;
        int c=5;
        String expect="tam giác thường";
        String result= TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
     }

     @Test
    void test823(){
        int a=8;
        int b=2;
        int c=3;
        String expect= "không phải tam giác";
        String result=TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
     }

     @Test
    void test121(){
        int a=-1;
        int b=2;
        int c=1;
        String expect="không phải tam giác";
        String result= TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
     }

     @Test
    void test011(){
        int a=0;
        int b=1;
        int c=1;
        String expect ="không phải tam giác";
        String result=TriangleClassifier.getTypeTriangle(a,b,c);
        assertEquals(expect,result);
     }

}