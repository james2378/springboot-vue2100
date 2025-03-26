package com.entity.model;

import com.entity.TiyuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 体育
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class TiyuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 点击次数
     */
    private Integer tiyuClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer tiyuDelete;


    /**
     * 体育简介
     */
    private String tiyuContent;


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
	 * 获取：体育名称
	 */
    public String getTiyuName() {
        return tiyuName;
    }


    /**
	 * 设置：体育名称
	 */
    public void setTiyuName(String tiyuName) {
        this.tiyuName = tiyuName;
    }
    /**
	 * 获取：体育照片
	 */
    public String getTiyuPhoto() {
        return tiyuPhoto;
    }


    /**
	 * 设置：体育照片
	 */
    public void setTiyuPhoto(String tiyuPhoto) {
        this.tiyuPhoto = tiyuPhoto;
    }
    /**
	 * 获取：体育视频
	 */
    public String getTiyuVideo() {
        return tiyuVideo;
    }


    /**
	 * 设置：体育视频
	 */
    public void setTiyuVideo(String tiyuVideo) {
        this.tiyuVideo = tiyuVideo;
    }
    /**
	 * 获取：体育类型
	 */
    public Integer getTiyuTypes() {
        return tiyuTypes;
    }


    /**
	 * 设置：体育类型
	 */
    public void setTiyuTypes(Integer tiyuTypes) {
        this.tiyuTypes = tiyuTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getTiyuClicknum() {
        return tiyuClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setTiyuClicknum(Integer tiyuClicknum) {
        this.tiyuClicknum = tiyuClicknum;
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
    public Integer getTiyuDelete() {
        return tiyuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setTiyuDelete(Integer tiyuDelete) {
        this.tiyuDelete = tiyuDelete;
    }
    /**
	 * 获取：体育简介
	 */
    public String getTiyuContent() {
        return tiyuContent;
    }


    /**
	 * 设置：体育简介
	 */
    public void setTiyuContent(String tiyuContent) {
        this.tiyuContent = tiyuContent;
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
