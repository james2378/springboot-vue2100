package com.entity.view;

import com.entity.YuleLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 娱乐留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yule_liuyan")
public class YuleLiuyanView extends YuleLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




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

		//级联表 yule
			/**
			* 娱乐名称
			*/
			private String yuleName;
			/**
			* 娱乐照片
			*/
			private String yulePhoto;
			/**
			* 娱乐视频
			*/
			private String yuleVideo;
			/**
			* 娱乐类型
			*/
			private Integer yuleTypes;
				/**
				* 娱乐类型的值
				*/
				private String yuleValue;
			/**
			* 点击次数
			*/
			private Integer yuleClicknum;
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
			private Integer yuleDelete;
			/**
			* 娱乐简介
			*/
			private String yuleContent;

	public YuleLiuyanView() {

	}

	public YuleLiuyanView(YuleLiuyanEntity yuleLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yuleLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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


				//级联表的get和set yule
					/**
					* 获取： 娱乐名称
					*/
					public String getYuleName() {
						return yuleName;
					}
					/**
					* 设置： 娱乐名称
					*/
					public void setYuleName(String yuleName) {
						this.yuleName = yuleName;
					}
					/**
					* 获取： 娱乐照片
					*/
					public String getYulePhoto() {
						return yulePhoto;
					}
					/**
					* 设置： 娱乐照片
					*/
					public void setYulePhoto(String yulePhoto) {
						this.yulePhoto = yulePhoto;
					}
					/**
					* 获取： 娱乐视频
					*/
					public String getYuleVideo() {
						return yuleVideo;
					}
					/**
					* 设置： 娱乐视频
					*/
					public void setYuleVideo(String yuleVideo) {
						this.yuleVideo = yuleVideo;
					}
					/**
					* 获取： 娱乐类型
					*/
					public Integer getYuleTypes() {
						return yuleTypes;
					}
					/**
					* 设置： 娱乐类型
					*/
					public void setYuleTypes(Integer yuleTypes) {
						this.yuleTypes = yuleTypes;
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
					* 获取： 点击次数
					*/
					public Integer getYuleClicknum() {
						return yuleClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setYuleClicknum(Integer yuleClicknum) {
						this.yuleClicknum = yuleClicknum;
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
					public Integer getYuleDelete() {
						return yuleDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYuleDelete(Integer yuleDelete) {
						this.yuleDelete = yuleDelete;
					}
					/**
					* 获取： 娱乐简介
					*/
					public String getYuleContent() {
						return yuleContent;
					}
					/**
					* 设置： 娱乐简介
					*/
					public void setYuleContent(String yuleContent) {
						this.yuleContent = yuleContent;
					}










}
