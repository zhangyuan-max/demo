package com.example555.demo.service;

import com.example555.demo.controller.AiData;
import com.example555.demo.controller.Mapperway;
import com.example555.demo.controller.Request;

import java.util.List;

public interface DemoService {


    List<Integer> getQuery(Request request);

    int getAddId(Request request);

    int getAddData(Request request);

    int getDeleteId(Request request);


   int getUpdateId(Request request);


    List<AiData> getRelation(Request request);

}
