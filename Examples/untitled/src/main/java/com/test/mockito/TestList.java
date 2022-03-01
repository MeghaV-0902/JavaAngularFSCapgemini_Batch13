package com.test.mockito;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.mock;

public class TestList {
    @Test
    public void letsMockListSize() {
        List list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10);
        assertEquals(10, list.size());
    }
    @Test
    public void letsMockListSizeWithMultipleReturnValues() {
        List list = mock(List.class);
        Mockito.when(list.size()).thenReturn(10).thenReturn(20);
        assertEquals(10, list.size()); // First Call
        assertEquals(20, list.size()); // Second Call
    }
    @Test
    public void letsMockListGet() {
        List<String> list = mock(List.class);
        Mockito.when(list.get(0)).thenReturn("letsMockListGetmethod value");
        assertEquals("letsMockListGetmethod value", list.get(0));
        assertNull(list.get(1));
    }

    @Test
    public void letsMockListGetWithAny() {
        List<String> list = mock(List.class);
        Mockito.when(list.get(Mockito.anyInt())).thenReturn("letsMockListGetmethod value");
// If you are using argument matchers, all arguments
// have to be provided by matchers.
        assertEquals("letsMockListGetmethod value", list.get(0));
        assertEquals("letsMockListGetmethod value", list.get(1));
    }
}
