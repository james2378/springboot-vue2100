package com.entity.view;

import com.entity.YishuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 艺术
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yishu")
public class YishuView extends YishuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 艺术类型的值
		*/
		private String yishuValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public YishuView() {

	}

	public YishuView(YishuEntity yishuEntity) {
		try {
			BeanUtils.copyProperties(this, yishuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 艺术类型的值
			*/
			public String getYishuValue() {
				return yishuValue;
			}
			/**
			* 设置： 艺术类型的值
			*/
			public void setYishuValue(String yishuValue) {
				this.yishuValue = yishuValue;
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
