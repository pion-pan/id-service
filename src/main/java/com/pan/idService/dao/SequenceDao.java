package com.pan.idService.dao;

import com.pan.idService.bo.model.Sequence;
import com.pan.pion.orm.mapper.BaseMapper;
/**
 * 该类负责数据访问接口，与mybatis的mapper文件对应。
 * @author: pan 
 * @date: 2017-05-08 11:17:16
 * @since 1.0.0
 */
public interface SequenceDao extends BaseMapper<Sequence> {
	
}