//BusinessImplClass.java which will implements retrieveTodos(user) method for matching arguments passed.
package com.test.business;
import java.util.ArrayList;
import java.util.List;

import com.test.data.api.ServiceToDo;

public class BusinessImplClass
{
    private ServiceToDo todoService;

    BusinessImplClass(ServiceToDo todoService)
    {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> allTodos = todoService.retrieveTodos(user);
        for (String todo : allTodos) {
            if (todo.contains("Abc")) {
                filteredTodos.add(todo);
            }
        }
        return filteredTodos;
    }
}

