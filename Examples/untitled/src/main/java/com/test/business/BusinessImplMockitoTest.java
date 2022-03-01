package com.test.business;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.test.data.api.ServiceToDo;

public class BusinessImplMockitoTest {
    @Test
    public void usingMockito() {
        ServiceToDo todoService = mock(ServiceToDo.class);
        List<String> allTodos = Arrays.asList("Stub1", "Stub2","Stub3");
        when(todoService.retrieveTodos("TestMockito")).thenReturn(allTodos);
        BusinessImplClass todoBusinessImpl = new BusinessImplClass(todoService);
        List<String> todos = todoBusinessImpl
                .retrieveTodosRelatedToSpring("Abc");
        assertEquals(2, todos.size());
    }
}