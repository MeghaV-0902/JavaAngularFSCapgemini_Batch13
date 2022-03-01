package com.test.business;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;

import java.util.List;
import org.junit.Test;
import com.test.data.api.ServiceToDo;
import com.test.data.stub.ServiceToDoStub;

public class ToDoBusinessImplMockTest {
    @Test
    public void testretrieveTodosRelatedToSpring_usingaMock() {
        ServiceToDo todoServicemock=mock(ServiceToDo.class);
        ServiceToDo todoService=new ServiceToDoStub();

        BusinessImplClass businessimpl=new BusinessImplClass(todoServicemock);
        List<String> filteredTodos=businessimpl.retrieveTodosRelatedToSpring("Dummy");
        assertEquals(2,filteredTodos.size() );
    }
}
