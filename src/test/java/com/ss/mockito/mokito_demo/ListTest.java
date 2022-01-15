package com.ss.mockito.mokito_demo;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class ListTest {

    @Test
    public void testListSize(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10);
        assertEquals(10,listMock.size());
    }

    @Test
    public void testListSizeMultipleReturns(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(10).thenReturn(20);
        assertEquals(10,listMock.size());
        assertEquals(20,listMock.size());
    }

    @Test
    public void testGetWithSpecificParameter(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("SomeString");
        assertEquals("SomeString",listMock.get(0));
        assertNull(listMock.get(1));
    }

    @Test
    public void testGetWithGenericParameter(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("SomeString");
        assertEquals("SomeString",listMock.get(0));
        assertEquals("SomeString",listMock.get(1));
    }


}
