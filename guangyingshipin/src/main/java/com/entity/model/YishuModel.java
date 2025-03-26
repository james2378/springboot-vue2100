package com.entity.model;

import com.entity.YishuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 艺术
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YishuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 点击次数
     */
    private Integer yishuClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer yishuDelete;


    /**
     * 艺术简介
     */
    private String yishuContent;


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
	 * 获取：艺术名称
	 */
    public String getYishuName() {
        return yishuName;
    }


    /**
	 * 设置：艺术名称
	 */
    public void setYishuName(String yishuName) {
        this.yishuName = yishuName;
    }
    /**
	 * 获取：艺术照片
	 */
    public String getYishuPhoto() {
        return yishuPhoto;
    }


    /**
	 * 设置：艺术照片
	 */
    public void setYishuPhoto(String yishuPhoto) {
        this.yishuPhoto = yishuPhoto;
    }
    /**
	 * 获取：艺术视频
	 */
    public String getYishuVideo() {
        return yishuVideo;
    }


    /**
	 * 设置：艺术视频
	 */
    public void setYishuVideo(String yishuVideo) {
        this.yishuVideo = yishuVideo;
    }
    /**
	 * 获取：艺术类型
	 */
    public Integer getYishuTypes() {
        return yishuTypes;
    }


    /**
	 * 设置：艺术类型
	 */
    public void setYishuTypes(Integer yishuTypes) {
        this.yishuTypes = yishuTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getYishuClicknum() {
        return yishuClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setYishuClicknum(Integer yishuClicknum) {
        this.yishuClicknum = yishuClicknum;
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
    public Integer getYishuDelete() {
        return yishuDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setYishuDelete(Integer yishuDelete) {
        this.yishuDelete = yishuDelete;
    }
    /**
	 * 获取：艺术简介
	 */
    public String getYishuContent() {
        return yishuContent;
    }


    /**
	 * 设置：艺术简介
	 */
    public void setYishuContent(String yishuContent) {
        this.yishuContent = yishuContent;
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
