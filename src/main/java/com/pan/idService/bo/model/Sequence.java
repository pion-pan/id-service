package com.pan.idService.bo.model;

import java.sql.Timestamp;

import com.pan.pion.orm.entity.BaseEntity;

/**
 * 该类是映射到表的实体类，负责与表进行一一对应。
 * @author: pan 
 * @date: 2017-05-08 11:09:29
 * @since 1.0.0
 */
public class Sequence extends BaseEntity {
private static final long serialVersionUID = 1L;
	public static final String COL_ID ="id";
	public static final String COL_UPDATE_TIME ="update_time";
	public static final String COL_DESC ="desc";
	public static final String COL_STEP ="step";
	public static final String COL_MAX_ID ="max_id";
	public static final String COL_BIZ_TAG ="biz_tag";

	/**
	 * 
	 */
	private Timestamp updateTime;

	/**
	 * 
	 */
	private String desc;

	/**
	 * 
	 */
	private Integer step;

	/**
	 * 
	 */
	private Long maxId;

	/**
	 * 
	 */
	private String bizTag;


	/**
	 * 
	 */
	public void setUpdateTime(Timestamp updateTime){
		this.updateTime = updateTime;
	}
	
	/**
	 * 
	 */
	public Timestamp getUpdateTime(){
		return  updateTime;
	}

	/**
	 * 
	 */
	public void setDesc(String desc){
		this.desc = desc;
	}
	
	/**
	 * 
	 */
	public String getDesc(){
		return  desc;
	}

	/**
	 * 
	 */
	public void setStep(Integer step){
		this.step = step;
	}
	
	/**
	 * 
	 */
	public Integer getStep(){
		return  step;
	}

	/**
	 * 
	 */
	public void setMaxId(Long maxId){
		this.maxId = maxId;
	}
	
	/**
	 * 
	 */
	public Long getMaxId(){
		return  maxId;
	}

	/**
	 * 
	 */
	public void setBizTag(String bizTag){
		this.bizTag = bizTag;
	}
	
	/**
	 * 
	 */
	public String getBizTag(){
		return  bizTag;
	}
}