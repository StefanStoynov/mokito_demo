package com.ss.mockito.mokito_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class SomeBusinessImplMockitoTest {

    @Test
    void findTheGreatestFromAllData() {
        DataService dataServiceMock =  mock(DataService.class);

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25,1});

        SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
        int result= businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}
