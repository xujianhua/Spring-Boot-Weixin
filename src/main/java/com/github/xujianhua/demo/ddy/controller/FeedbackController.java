package com.github.xujianhua.demo.ddy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.xujianhua.demo.ddy.entity.FeedbackEntity;
import com.github.xujianhua.demo.ddy.service.FeedbackService;

@RestController
@RequestMapping("/ddy/feedback")
public class FeedbackController {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
    @Resource
    private FeedbackService feedbackService;
    
    @RequestMapping("/getById")
    public FeedbackEntity getById(String id){
        return feedbackService.getById(id);
    }
    
    @RequestMapping("/list")
    public List<FeedbackEntity> List(){
    	this.logger.info("ddy feedback List");
    	PageHelper.startPage(2,3);  //显示第一页2条数据
        return feedbackService.findList();
    }
}