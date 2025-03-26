package com.entity.model;

import com.entity.PapiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * papi酱视频
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class PapiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 点击次数
     */
    private Integer papiClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer papiDelete;


    /**
     * papi酱视频简介
     */
    private String papiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：papi酱视频名称
	 */
    public String getPapiName() {
        return papiName;
    }


    /**
	 * 设置：papi酱视频名称
	 */
    public void setPapiName(String papiName) {
        this.papiName = papiName;
    }
    /**
	 * 获取：papi酱视频照片
	 */
    public String getPapiPhoto() {
        return papiPhoto;
    }


    /**
	 * 设置：papi酱视频照片
	 */
    public void setPapiPhoto(String papiPhoto) {
        this.papiPhoto = papiPhoto;
    }
    /**
	 * 获取：papi酱视频视频
	 */
    public String getPapiVideo() {
        return papiVideo;
    }


    /**
	 * 设置：papi酱视频视频
	 */
    public void setPapiVideo(String papiVideo) {
        this.papiVideo = papiVideo;
    }
    /**
	 * 获取：papi酱视频类型
	 */
    public Integer getPapiTypes() {
        return papiTypes;
    }


    /**
	 * 设置：papi酱视频类型
	 */
    public void setPapiTypes(Integer papiTypes) {
        this.papiTypes = papiTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getPapiClicknum() {
        return papiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setPapiClicknum(Integer papiClicknum) {
        this.papiClicknum = papiClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getPapiDelete() {
        return papiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setPapiDelete(Integer papiDelete) {
        this.papiDelete = papiDelete;
    }
    /**
	 * 获取：papi酱视频简介
	 */
    public String getPapiContent() {
        return papiContent;
    }


    /**
	 * 设置：papi酱视频简介
	 */
    public void setPapiContent(String papiContent) {
        this.papiContent = papiContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
