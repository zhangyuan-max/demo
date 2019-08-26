package com.example555.demo.dao.mapper;

import com.example555.demo.controller.AiData;
import com.example555.demo.controller.Mapperway;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface DemoMapper {

    List<Integer> getQuery(@Param("userCompanyId") Integer userCompanyId);

    int getAddId(@Param("id") Integer id,@Param("userCompanyId") Integer userCompanyId,@Param("name") String name,@Param("price") Integer price);

    int getAddData(AiData requestData);

    int getDeleteId(@Param("userCompanyId") Integer userCompanyId);

}
