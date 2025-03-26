package com.entity.view;

import com.entity.NbaLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * NBA留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("nba_liuyan")
public class NbaLiuyanView extends NbaLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 nba
			/**
			* NBA名称
			*/
			private String nbaName;
			/**
			* NBA照片
			*/
			private String nbaPhoto;
			/**
			* NBA视频
			*/
			private String nbaVideo;
			/**
			* NBA类型
			*/
			private Integer nbaTypes;
				/**
				* NBA类型的值
				*/
				private String nbaValue;
			/**
			* 点击次数
			*/
			private Integer nbaClicknum;
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
			private Integer nbaDelete;
			/**
			* NBA简介
			*/
			private String nbaContent;

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

	public NbaLiuyanView() {

	}

	public NbaLiuyanView(NbaLiuyanEntity nbaLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, nbaLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}










				//级联表的get和set nba
					/**
					* 获取： NBA名称
					*/
					public String getNbaName() {
						return nbaName;
					}
					/**
					* 设置： NBA名称
					*/
					public void setNbaName(String nbaName) {
						this.nbaName = nbaName;
					}
					/**
					* 获取： NBA照片
					*/
					public String getNbaPhoto() {
						return nbaPhoto;
					}
					/**
					* 设置： NBA照片
					*/
					public void setNbaPhoto(String nbaPhoto) {
						this.nbaPhoto = nbaPhoto;
					}
					/**
					* 获取： NBA视频
					*/
					public String getNbaVideo() {
						return nbaVideo;
					}
					/**
					* 设置： NBA视频
					*/
					public void setNbaVideo(String nbaVideo) {
						this.nbaVideo = nbaVideo;
					}
					/**
					* 获取： NBA类型
					*/
					public Integer getNbaTypes() {
						return nbaTypes;
					}
					/**
					* 设置： NBA类型
					*/
					public void setNbaTypes(Integer nbaTypes) {
						this.nbaTypes = nbaTypes;
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
					* 获取： 点击次数
					*/
					public Integer getNbaClicknum() {
						return nbaClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setNbaClicknum(Integer nbaClicknum) {
						this.nbaClicknum = nbaClicknum;
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
					public Integer getNbaDelete() {
						return nbaDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setNbaDelete(Integer nbaDelete) {
						this.nbaDelete = nbaDelete;
					}
					/**
					* 获取： NBA简介
					*/
					public String getNbaContent() {
						return nbaContent;
					}
					/**
					* 设置： NBA简介
					*/
					public void setNbaContent(String nbaContent) {
						this.nbaContent = nbaContent;
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
