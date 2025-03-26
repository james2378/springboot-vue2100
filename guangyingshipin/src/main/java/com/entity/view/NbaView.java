package com.entity.view;

import com.entity.NbaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * NBA
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("nba")
public class NbaView extends NbaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* NBA类型的值
		*/
		private String nbaValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public NbaView() {

	}

	public NbaView(NbaEntity nbaEntity) {
		try {
			BeanUtils.copyProperties(this, nbaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： NBA类型的值
			*/
			public String getNbaValue() {
				return nbaValue;
			}
			/**
			* 设置： NBA类型的值
			*/
			public void setNbaValue(String nbaValue) {
				this.nbaValue = nbaValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}





















}
