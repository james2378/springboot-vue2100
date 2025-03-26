package com.entity.vo;

import com.entity.PapiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * papi酱视频
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("papi")
public class PapiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * papi酱视频名称
     */

    @TableField(value = "papi_name")
    private String papiName;


    /**
     * papi酱视频照片
     */

    @TableField(value = "papi_photo")
    private String papiPhoto;


    /**
     * papi酱视频视频
     */

    @TableField(value = "papi_video")
    private String papiVideo;


    /**
     * papi酱视频类型
     */

    @TableField(value = "papi_types")
    private Integer papiTypes;


    /**
     * 点击次数
     */

    @TableField(value = "papi_clicknum")
    private Integer papiClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "papi_delete")
    private Integer papiDelete;


    /**
     * papi酱视频简介
     */

    @TableField(value = "papi_content")
    private String papiContent;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：papi酱视频名称
	 */
    public String getPapiName() {
        return papiName;
    }


    /**
	 * 获取：papi酱视频名称
	 */

    public void setPapiName(String papiName) {
        this.papiName = papiName;
    }
    /**
	 * 设置：papi酱视频照片
	 */
    public String getPapiPhoto() {
        return papiPhoto;
    }


    /**
	 * 获取：papi酱视频照片
	 */

    public void setPapiPhoto(String papiPhoto) {
        this.papiPhoto = papiPhoto;
    }
    /**
	 * 设置：papi酱视频视频
	 */
    public String getPapiVideo() {
        return papiVideo;
    }


    /**
	 * 获取：papi酱视频视频
	 */

    public void setPapiVideo(String papiVideo) {
        this.papiVideo = papiVideo;
    }
    /**
	 * 设置：papi酱视频类型
	 */
    public Integer getPapiTypes() {
        return papiTypes;
    }


    /**
	 * 获取：papi酱视频类型
	 */

    public void setPapiTypes(Integer papiTypes) {
        this.papiTypes = papiTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getPapiClicknum() {
        return papiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setPapiClicknum(Integer papiClicknum) {
        this.papiClicknum = papiClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getPapiDelete() {
        return papiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setPapiDelete(Integer papiDelete) {
        this.papiDelete = papiDelete;
    }
    /**
	 * 设置：papi酱视频简介
	 */
    public String getPapiContent() {
        return papiContent;
    }


    /**
	 * 获取：papi酱视频简介
	 */

    public void setPapiContent(String papiContent) {
        this.papiContent = papiContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
