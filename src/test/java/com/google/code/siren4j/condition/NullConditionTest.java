/*******************************************************************************************
 * The MIT License (MIT)
 * 
 * Copyright (c) 2013 Erik R Serating
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit
 * persons to whom the Software is furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *********************************************************************************************/
package com.google.code.siren4j.condition;

import static org.junit.Assert.*;

import org.junit.Test;

import com.google.code.siren4j.annotations.Siren4JCondition.Is;

public class NullConditionTest extends BaseConditionTest {

    @Test
    public void testEvaluateString() {
        assertFalse(cond.evaluate(EMPTY_STRING));
        assertFalse(cond.evaluate(NON_EMPTY_STRING));        
    }
    
    @Test
    public void testEvaluateArray() {
        assertFalse(cond.evaluate(EMPTY_ARRAY));
        assertFalse(cond.evaluate(NON_EMPTY_ARRAY));         
    }
    
    @Test
    public void testEvaluateCollection() {
        assertFalse(cond.evaluate(EMPTY_COLLECTION));
        assertFalse(cond.evaluate(NON_EMPTY_COLLECTION));         
    }
    
    @Test
    public void testEvaluateMap() {
        assertFalse(cond.evaluate(EMPTY_MAP));
        assertFalse(cond.evaluate(NON_EMPTY_MAP));         
    }
    
    @Test
    public void testEvaluateNull() {
        assertTrue(cond.evaluate(null));         
    }
    
    @Test
    public void testEvaluateObject() {
        assertFalse(cond.evaluate(OBJECT));         
    }
    
    @Test
    public void testEvaluateIntegerPrimative() {
        assertFalse(cond.evaluate(INT_ZERO));
        assertFalse(cond.evaluate(INT_NEGATIVE));
        assertFalse(cond.evaluate(INT_POSITIVE));        
    }
    
    @Test
    public void testEvaluateInteger() {
        assertFalse(cond.evaluate(INTEGER_ZERO));
        assertFalse(cond.evaluate(INTEGER_NEGATIVE));
        assertFalse(cond.evaluate(INTEGER_POSITIVE));        
    }
    
    @Test
    public void testEvaluateFloat() {
        assertFalse(cond.evaluate(FLOAT_ZERO));
        assertFalse(cond.evaluate(FLOAT_NEGATIVE));
        assertFalse(cond.evaluate(FLOAT_POSITIVE));        
    }
    
    @Test
    public void testEvaluateLong() {
        assertFalse(cond.evaluate(LONG_ZERO));
        assertFalse(cond.evaluate(LONG_NEGATIVE));
        assertFalse(cond.evaluate(LONG_POSITIVE));        
    }
    
    @Test
    public void testEvaluateByte() {
        assertFalse(cond.evaluate(BYTE_ZERO));
        assertFalse(cond.evaluate(BYTE_NEGATIVE));
        assertFalse(cond.evaluate(BYTE_POSITIVE));        
    }
    
    @Test
    public void testEvaluteBoolean() {
        assertFalse(cond.evaluate(BOOLEAN_TRUE));
        assertFalse(cond.evaluate(BOOLEAN_FALSE));       
    }
    
    @Test
    public void testEvaluteBooleanPrimative() {
        assertFalse(cond.evaluate(BOOLEAN_PRIMATIVE_TRUE));
        assertFalse(cond.evaluate(BOOLEAN_PRIMATIVE_FALSE));         
    }
    
    @Override
    protected Is getType() {
        return Is.NULL;
    }

}
