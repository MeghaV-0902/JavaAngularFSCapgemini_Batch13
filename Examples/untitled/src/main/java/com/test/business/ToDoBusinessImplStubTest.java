package com.test.business;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import com.test.data.api.ServiceToDo;
import com.test.data.stub.ServiceToDoStub;

public class ToDoBusinessImplStubTest {

    @Test
    public void testretrieveTodosRelatedToSpring_usingaStub() {

        ServiceToDo todoService=new ServiceToDoStub();
        BusinessImplClass businessimpl=new BusinessImplClass(todoService);
        List<String> filteredTodos=businessimpl.retrieveTodosRelatedToSpring("is");
        assertEquals(2,filteredTodos.size() );
    } }
