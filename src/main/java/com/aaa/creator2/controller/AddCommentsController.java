package com.aaa.creator2.controller;

import com.aaa.creator2.entity.Comments;

import com.aaa.creator2.service.AddCommentsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("Comments")
public class AddCommentsController {
    @Autowired
    private AddCommentsServiceImpl addCommentsServiceImpl;
    @RequestMapping("add")
    @ResponseBody
    public int addComments(Comments comments){
        int i = addCommentsServiceImpl.addComments(comments);
        return i;
    }
}
