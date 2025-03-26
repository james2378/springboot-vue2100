package com.entity.view;

import com.entity.YuleEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 娱乐
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yule")
public class YuleView extends YuleEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 娱乐类型的值
		*/
		private String yuleValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public YuleView() {

	}

	public YuleView(YuleEntity yuleEntity) {
		try {
			BeanUtils.copyProperties(this, yuleEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 娱乐类型的值
			*/
			public String getYuleValue() {
				return yuleValue;
			}
			/**
			* 设置： 娱乐类型的值
			*/
			public void setYuleValue(String yuleValue) {
				this.yuleValue = yuleValue;
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
