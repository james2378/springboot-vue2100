package com.entity.model;

import com.entity.YuleEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 娱乐
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YuleModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 点击次数
     */
    private Integer yuleClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer yuleDelete;


    /**
     * 娱乐简介
     */
    private String yuleContent;


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
	 * 获取：娱乐名称
	 */
    public String getYuleName() {
        return yuleName;
    }


    /**
	 * 设置：娱乐名称
	 */
    public void setYuleName(String yuleName) {
        this.yuleName = yuleName;
    }
    /**
	 * 获取：娱乐照片
	 */
    public String getYulePhoto() {
        return yulePhoto;
    }


    /**
	 * 设置：娱乐照片
	 */
    public void setYulePhoto(String yulePhoto) {
        this.yulePhoto = yulePhoto;
    }
    /**
	 * 获取：娱乐视频
	 */
    public String getYuleVideo() {
        return yuleVideo;
    }


    /**
	 * 设置：娱乐视频
	 */
    public void setYuleVideo(String yuleVideo) {
        this.yuleVideo = yuleVideo;
    }
    /**
	 * 获取：娱乐类型
	 */
    public Integer getYuleTypes() {
        return yuleTypes;
    }


    /**
	 * 设置：娱乐类型
	 */
    public void setYuleTypes(Integer yuleTypes) {
        this.yuleTypes = yuleTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getYuleClicknum() {
        return yuleClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setYuleClicknum(Integer yuleClicknum) {
        this.yuleClicknum = yuleClicknum;
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
    public Integer getYuleDelete() {
        return yuleDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYuleDelete(Integer yuleDelete) {
        this.yuleDelete = yuleDelete;
    }
    /**
	 * 获取：娱乐简介
	 */
    public String getYuleContent() {
        return yuleContent;
    }


    /**
	 * 设置：娱乐简介
	 */
    public void setYuleContent(String yuleContent) {
        this.yuleContent = yuleContent;
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
