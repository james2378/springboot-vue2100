package com.entity.view;

import com.entity.PapiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * papi酱视频
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("papi")
public class PapiView extends PapiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* papi酱视频类型的值
		*/
		private String papiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public PapiView() {

	}

	public PapiView(PapiEntity papiEntity) {
		try {
			BeanUtils.copyProperties(this, papiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： papi酱视频类型的值
			*/
			public String getPapiValue() {
				return papiValue;
			}
			/**
			* 设置： papi酱视频类型的值
			*/
			public void setPapiValue(String papiValue) {
				this.papiValue = papiValue;
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
