package com.example555.demo.service.Impl;

import com.example555.demo.controller.AiData;
import com.example555.demo.controller.Mapperway;
import com.example555.demo.controller.Request;
import com.example555.demo.dao.mapper.DemoMapper;
import com.example555.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DemoServiceImpl implements DemoService {

    @Autowired
    private DemoMapper demoMapper;

   public List<Integer> getQuery(Request request){
      Integer userCompanyId = request.getUserCompanyId();

        return demoMapper.getQuery(userCompanyId);
   }


// 添加
    public int getAddId(Request request){
        Integer userCompanyId =request.getUserCompanyId();
        Integer id= request.getId();
        Integer price = request.getPrice();
        String name = request.getName();

         return demoMapper.getAddId(id,userCompanyId,name,price);
    }

    // 添加
    public int getAddData(Request request){

        Integer userCompanyId = request.getUserCompanyId();
        Integer id = request.getId();
        Integer price = request.getPrice();
        String name = request.getName();

        AiData requestData = new AiData();

        requestData.setUserCompanyId(userCompanyId);
        requestData.setId(id);
        requestData.setName(name);
        requestData.setPrice(price);



        return demoMapper.getAddData(requestData);
    }



    public int getDeleteId(Request request){
        Integer userCompanyId = request.getUserCompanyId();


         return demoMapper.getDeleteId(userCompanyId);
    }


    public int getUpdateId(Request request){
        Integer userCompanyId = request.getUserCompanyId();
        Integer id = request.getId();
        Integer price = request.getPrice();
        String name = request.getName();

        AiData requestUpdate = new AiData();

        requestUpdate.setUserCompanyId(userCompanyId);
        requestUpdate.setId(id);
        requestUpdate.setName(name);
        requestUpdate.setPrice(price);



        return demoMapper.getUpdateId(requestUpdate);
    }


    public List<AiData> getRelation(Request request){


        return demoMapper.getRelation();
    }

}
