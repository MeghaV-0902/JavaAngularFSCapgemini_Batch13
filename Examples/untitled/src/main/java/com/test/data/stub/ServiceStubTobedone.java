package com.test.data.stub;

import java.util.Arrays;
import java.util.List;

import com.test.data.api.ServiceToDo;

public class ServiceStubTobedone implements ServiceToDo {
    public List<String> retrieveTodos(String user) {

        return Arrays.asList("Stub1", "Stub2","Stub3");

    }
}
