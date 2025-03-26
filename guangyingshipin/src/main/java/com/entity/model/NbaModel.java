package com.entity.model;

import com.entity.NbaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * NBA
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class NbaModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 点击次数
     */
    private Integer nbaClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer nbaDelete;


    /**
     * NBA简介
     */
    private String nbaContent;


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
	 * 获取：NBA名称
	 */
    public String getNbaName() {
        return nbaName;
    }


    /**
	 * 设置：NBA名称
	 */
    public void setNbaName(String nbaName) {
        this.nbaName = nbaName;
    }
    /**
	 * 获取：NBA照片
	 */
    public String getNbaPhoto() {
        return nbaPhoto;
    }


    /**
	 * 设置：NBA照片
	 */
    public void setNbaPhoto(String nbaPhoto) {
        this.nbaPhoto = nbaPhoto;
    }
    /**
	 * 获取：NBA视频
	 */
    public String getNbaVideo() {
        return nbaVideo;
    }


    /**
	 * 设置：NBA视频
	 */
    public void setNbaVideo(String nbaVideo) {
        this.nbaVideo = nbaVideo;
    }
    /**
	 * 获取：NBA类型
	 */
    public Integer getNbaTypes() {
        return nbaTypes;
    }


    /**
	 * 设置：NBA类型
	 */
    public void setNbaTypes(Integer nbaTypes) {
        this.nbaTypes = nbaTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getNbaClicknum() {
        return nbaClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setNbaClicknum(Integer nbaClicknum) {
        this.nbaClicknum = nbaClicknum;
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
    public Integer getNbaDelete() {
        return nbaDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setNbaDelete(Integer nbaDelete) {
        this.nbaDelete = nbaDelete;
    }
    /**
	 * 获取：NBA简介
	 */
    public String getNbaContent() {
        return nbaContent;
    }


    /**
	 * 设置：NBA简介
	 */
    public void setNbaContent(String nbaContent) {
        this.nbaContent = nbaContent;
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
