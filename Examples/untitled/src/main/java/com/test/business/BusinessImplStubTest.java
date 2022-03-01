
package com.test.business;

import com.test.data.api.ServiceToDo;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class BusinessImplStubTest {
    @Test
    public void usingAStub() {
        ServiceToDo todoService = new ServiceToDo() {

            public List<String> retrieveTodos(String user) {
// TODO Auto-generated method stub
                return null;
            }};
        BusinessImplClass todoBusinessImpl = new BusinessImplClass(todoService);
        List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("Abc");
        assertEquals(2, todos.size());
    }
}
