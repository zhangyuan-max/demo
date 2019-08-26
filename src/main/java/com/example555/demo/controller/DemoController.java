package com.example555.demo.controller;
//import java.util.HashMap;
import java.util.List;

        import com.example555.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/get-query", method = RequestMethod.POST)
    public List<Integer> getQuery(@RequestBody Request request){
     return demoService.getQuery(request);

    }

    @RequestMapping(value = "/get-add-id", method = RequestMethod.POST)
    public int getAddId(@RequestBody Request request){
        return demoService.getAddId(request);

    }


    @RequestMapping(value = "/get-add-data", method = RequestMethod.POST)
    public int getAddData(@RequestBody Request request){
        return demoService.getAddId(request);

    }


    @RequestMapping(value = "/get-delete-id", method = RequestMethod.POST)
    public int getDeleteId(@RequestBody Request request){
        return demoService.getDeleteId(request);

    }

}
