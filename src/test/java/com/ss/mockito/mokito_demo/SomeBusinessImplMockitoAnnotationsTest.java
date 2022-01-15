package com.ss.mockito.mokito_demo;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
class SomeBusinessImplMockitoAnnotationsTest {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBusinessImpl businessImpl;

    @Test
    void findTheGreatestFromAllData() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{25, 1});

        int result = businessImpl.findTheGreatestFromAllData();
        assertEquals(25, result);
    }
}
