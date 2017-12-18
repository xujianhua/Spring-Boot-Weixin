package com.github.xujianhua.demo.ddy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.xujianhua.demo.ddy.dao.FeedbackMapper;
import com.github.xujianhua.demo.ddy.entity.FeedbackEntity;

@Service
public class  FeedbackService {
	@Autowired
    private FeedbackMapper feedbackMapper;
	 
    public FeedbackEntity getById(String id){
    	return feedbackMapper.getById(id);
    }
    
    public List<FeedbackEntity> findList(){
    	return feedbackMapper.findList();
    }
}