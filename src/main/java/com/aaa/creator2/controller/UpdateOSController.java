package com.aaa.creator2.controller;


import com.aaa.creator2.service.UpdateOSServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Update")
public class UpdateOSController {
    @Autowired
    private UpdateOSServiceImpl updateOSServiceImpl;
    @RequestMapping("OS")
    @ResponseBody
    public int updateOS(Integer oid){
        int i=updateOSServiceImpl.updateOS(oid);
        return i;
    }
}
