package com.ss.mockito.mokito_demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SomeBusinessImplStubTest {

    @Test
    void findTheGreatestFromAllData() {
        SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
        int result= businessImpl.findTheGreatestFromAllData();
        assertEquals(24, result);
    }
}

//disadvantage is for every scenario we have to create a new Stub. We can use mockito
class DataServiceStub implements DataService {

    @Override
    public int[] retrieveAllData() {
        return new int[]{24,6,15};
    }
}