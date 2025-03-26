package com.entity.view;

import com.entity.PapiCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * papi酱视频收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("papi_collection")
public class PapiCollectionView extends PapiCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 papi
			/**
			* papi酱视频名称
			*/
			private String papiName;
			/**
			* papi酱视频照片
			*/
			private String papiPhoto;
			/**
			* papi酱视频视频
			*/
			private String papiVideo;
			/**
			* papi酱视频类型
			*/
			private Integer papiTypes;
				/**
				* papi酱视频类型的值
				*/
				private String papiValue;
			/**
			* 点击次数
			*/
			private Integer papiClicknum;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer papiDelete;
			/**
			* papi酱视频简介
			*/
			private String papiContent;

		//级联表 yonghu
			/**
			* 用户昵称
			*/
			private String yonghuName;
			/**
			* 用户姓名
			*/
			private String yonghuXingming;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户照片
			*/
			private String yonghuPhoto;

	public PapiCollectionView() {

	}

	public PapiCollectionView(PapiCollectionEntity papiCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, papiCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}






















				//级联表的get和set papi
					/**
					* 获取： papi酱视频名称
					*/
					public String getPapiName() {
						return papiName;
					}
					/**
					* 设置： papi酱视频名称
					*/
					public void setPapiName(String papiName) {
						this.papiName = papiName;
					}
					/**
					* 获取： papi酱视频照片
					*/
					public String getPapiPhoto() {
						return papiPhoto;
					}
					/**
					* 设置： papi酱视频照片
					*/
					public void setPapiPhoto(String papiPhoto) {
						this.papiPhoto = papiPhoto;
					}
					/**
					* 获取： papi酱视频视频
					*/
					public String getPapiVideo() {
						return papiVideo;
					}
					/**
					* 设置： papi酱视频视频
					*/
					public void setPapiVideo(String papiVideo) {
						this.papiVideo = papiVideo;
					}
					/**
					* 获取： papi酱视频类型
					*/
					public Integer getPapiTypes() {
						return papiTypes;
					}
					/**
					* 设置： papi酱视频类型
					*/
					public void setPapiTypes(Integer papiTypes) {
						this.papiTypes = papiTypes;
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
					* 获取： 点击次数
					*/
					public Integer getPapiClicknum() {
						return papiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setPapiClicknum(Integer papiClicknum) {
						this.papiClicknum = papiClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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
					/**
					* 获取： 逻辑删除
					*/
					public Integer getPapiDelete() {
						return papiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setPapiDelete(Integer papiDelete) {
						this.papiDelete = papiDelete;
					}
					/**
					* 获取： papi酱视频简介
					*/
					public String getPapiContent() {
						return papiContent;
					}
					/**
					* 设置： papi酱视频简介
					*/
					public void setPapiContent(String papiContent) {
						this.papiContent = papiContent;
					}




























				//级联表的get和set yonghu
					/**
					* 获取： 用户昵称
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户昵称
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuXingming() {
						return yonghuXingming;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuXingming(String yonghuXingming) {
						this.yonghuXingming = yonghuXingming;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户照片
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户照片
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}












}
