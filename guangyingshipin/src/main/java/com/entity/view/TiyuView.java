package com.entity.view;

import com.entity.TiyuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 体育
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tiyu")
public class TiyuView extends TiyuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 体育类型的值
		*/
		private String tiyuValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public TiyuView() {

	}

	public TiyuView(TiyuEntity tiyuEntity) {
		try {
			BeanUtils.copyProperties(this, tiyuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 体育类型的值
			*/
			public String getTiyuValue() {
				return tiyuValue;
			}
			/**
			* 设置： 体育类型的值
			*/
			public void setTiyuValue(String tiyuValue) {
				this.tiyuValue = tiyuValue;
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
