package com.entity.view;

import com.entity.TiyuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 体育留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("tiyu_liuyan")
public class TiyuLiuyanView extends TiyuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 tiyu
			/**
			* 体育名称
			*/
			private String tiyuName;
			/**
			* 体育照片
			*/
			private String tiyuPhoto;
			/**
			* 体育视频
			*/
			private String tiyuVideo;
			/**
			* 体育类型
			*/
			private Integer tiyuTypes;
				/**
				* 体育类型的值
				*/
				private String tiyuValue;
			/**
			* 点击次数
			*/
			private Integer tiyuClicknum;
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
			private Integer tiyuDelete;
			/**
			* 体育简介
			*/
			private String tiyuContent;

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

	public TiyuLiuyanView() {

	}

	public TiyuLiuyanView(TiyuLiuyanEntity tiyuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, tiyuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set tiyu
					/**
					* 获取： 体育名称
					*/
					public String getTiyuName() {
						return tiyuName;
					}
					/**
					* 设置： 体育名称
					*/
					public void setTiyuName(String tiyuName) {
						this.tiyuName = tiyuName;
					}
					/**
					* 获取： 体育照片
					*/
					public String getTiyuPhoto() {
						return tiyuPhoto;
					}
					/**
					* 设置： 体育照片
					*/
					public void setTiyuPhoto(String tiyuPhoto) {
						this.tiyuPhoto = tiyuPhoto;
					}
					/**
					* 获取： 体育视频
					*/
					public String getTiyuVideo() {
						return tiyuVideo;
					}
					/**
					* 设置： 体育视频
					*/
					public void setTiyuVideo(String tiyuVideo) {
						this.tiyuVideo = tiyuVideo;
					}
					/**
					* 获取： 体育类型
					*/
					public Integer getTiyuTypes() {
						return tiyuTypes;
					}
					/**
					* 设置： 体育类型
					*/
					public void setTiyuTypes(Integer tiyuTypes) {
						this.tiyuTypes = tiyuTypes;
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
					* 获取： 点击次数
					*/
					public Integer getTiyuClicknum() {
						return tiyuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setTiyuClicknum(Integer tiyuClicknum) {
						this.tiyuClicknum = tiyuClicknum;
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
					public Integer getTiyuDelete() {
						return tiyuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setTiyuDelete(Integer tiyuDelete) {
						this.tiyuDelete = tiyuDelete;
					}
					/**
					* 获取： 体育简介
					*/
					public String getTiyuContent() {
						return tiyuContent;
					}
					/**
					* 设置： 体育简介
					*/
					public void setTiyuContent(String tiyuContent) {
						this.tiyuContent = tiyuContent;
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
