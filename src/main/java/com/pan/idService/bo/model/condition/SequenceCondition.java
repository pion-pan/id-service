package com.pan.idService.bo.model.condition;

import java.sql.Timestamp;

import com.pan.pion.orm.BaseCondition;

/**
 * 该类是表的条件类，用于覆盖查询参数，现在默认为和entity一致。
 * @author: pan 
 * @date: 2017-05-08 11:09:29
 * @since 1.0.0
 */
public class SequenceCondition extends BaseCondition {

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