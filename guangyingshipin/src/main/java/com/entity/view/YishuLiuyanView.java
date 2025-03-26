package com.entity.view;

import com.entity.YishuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 艺术留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yishu_liuyan")
public class YishuLiuyanView extends YishuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 yishu
			/**
			* 艺术名称
			*/
			private String yishuName;
			/**
			* 艺术照片
			*/
			private String yishuPhoto;
			/**
			* 艺术视频
			*/
			private String yishuVideo;
			/**
			* 艺术类型
			*/
			private Integer yishuTypes;
				/**
				* 艺术类型的值
				*/
				private String yishuValue;
			/**
			* 点击次数
			*/
			private Integer yishuClicknum;
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
			private Integer yishuDelete;
			/**
			* 艺术简介
			*/
			private String yishuContent;

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

	public YishuLiuyanView() {

	}

	public YishuLiuyanView(YishuLiuyanEntity yishuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, yishuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}








































				//级联表的get和set yishu
					/**
					* 获取： 艺术名称
					*/
					public String getYishuName() {
						return yishuName;
					}
					/**
					* 设置： 艺术名称
					*/
					public void setYishuName(String yishuName) {
						this.yishuName = yishuName;
					}
					/**
					* 获取： 艺术照片
					*/
					public String getYishuPhoto() {
						return yishuPhoto;
					}
					/**
					* 设置： 艺术照片
					*/
					public void setYishuPhoto(String yishuPhoto) {
						this.yishuPhoto = yishuPhoto;
					}
					/**
					* 获取： 艺术视频
					*/
					public String getYishuVideo() {
						return yishuVideo;
					}
					/**
					* 设置： 艺术视频
					*/
					public void setYishuVideo(String yishuVideo) {
						this.yishuVideo = yishuVideo;
					}
					/**
					* 获取： 艺术类型
					*/
					public Integer getYishuTypes() {
						return yishuTypes;
					}
					/**
					* 设置： 艺术类型
					*/
					public void setYishuTypes(Integer yishuTypes) {
						this.yishuTypes = yishuTypes;
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
					* 获取： 点击次数
					*/
					public Integer getYishuClicknum() {
						return yishuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setYishuClicknum(Integer yishuClicknum) {
						this.yishuClicknum = yishuClicknum;
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
					public Integer getYishuDelete() {
						return yishuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setYishuDelete(Integer yishuDelete) {
						this.yishuDelete = yishuDelete;
					}
					/**
					* 获取： 艺术简介
					*/
					public String getYishuContent() {
						return yishuContent;
					}
					/**
					* 设置： 艺术简介
					*/
					public void setYishuContent(String yishuContent) {
						this.yishuContent = yishuContent;
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
