package com.github.xujianhua.demo.ddy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.github.xujianhua.demo.ddy.entity.FeedbackEntity;

public interface FeedbackMapper {
    public FeedbackEntity getById(String id);
	
    public List<FeedbackEntity> findList();
}