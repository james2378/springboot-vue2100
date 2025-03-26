package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 娱乐
 *
 * @author 
 * @email
 */
@TableName("yule")
public class YuleEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YuleEntity() {

	}

	public YuleEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 娱乐名称
     */
    @TableField(value = "yule_name")

    private String yuleName;


    /**
     * 娱乐照片
     */
    @TableField(value = "yule_photo")

    private String yulePhoto;


    /**
     * 娱乐视频
     */
    @TableField(value = "yule_video")

    private String yuleVideo;


    /**
     * 娱乐类型
     */
    @TableField(value = "yule_types")

    private Integer yuleTypes;


    /**
     * 点击次数
     */
    @TableField(value = "yule_clicknum")

    private Integer yuleClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "yule_delete")

    private Integer yuleDelete;


    /**
     * 娱乐简介
     */
    @TableField(value = "yule_content")

    private String yuleContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：娱乐名称
	 */
    public String getYuleName() {
        return yuleName;
    }


    /**
	 * 获取：娱乐名称
	 */

    public void setYuleName(String yuleName) {
        this.yuleName = yuleName;
    }
    /**
	 * 设置：娱乐照片
	 */
    public String getYulePhoto() {
        return yulePhoto;
    }


    /**
	 * 获取：娱乐照片
	 */

    public void setYulePhoto(String yulePhoto) {
        this.yulePhoto = yulePhoto;
    }
    /**
	 * 设置：娱乐视频
	 */
    public String getYuleVideo() {
        return yuleVideo;
    }


    /**
	 * 获取：娱乐视频
	 */

    public void setYuleVideo(String yuleVideo) {
        this.yuleVideo = yuleVideo;
    }
    /**
	 * 设置：娱乐类型
	 */
    public Integer getYuleTypes() {
        return yuleTypes;
    }


    /**
	 * 获取：娱乐类型
	 */

    public void setYuleTypes(Integer yuleTypes) {
        this.yuleTypes = yuleTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getYuleClicknum() {
        return yuleClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setYuleClicknum(Integer yuleClicknum) {
        this.yuleClicknum = yuleClicknum;
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
    public Integer getYuleDelete() {
        return yuleDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setYuleDelete(Integer yuleDelete) {
        this.yuleDelete = yuleDelete;
    }
    /**
	 * 设置：娱乐简介
	 */
    public String getYuleContent() {
        return yuleContent;
    }


    /**
	 * 获取：娱乐简介
	 */

    public void setYuleContent(String yuleContent) {
        this.yuleContent = yuleContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Yule{" +
            "id=" + id +
            ", yuleName=" + yuleName +
            ", yulePhoto=" + yulePhoto +
            ", yuleVideo=" + yuleVideo +
            ", yuleTypes=" + yuleTypes +
            ", yuleClicknum=" + yuleClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", yuleDelete=" + yuleDelete +
            ", yuleContent=" + yuleContent +
            ", createTime=" + createTime +
        "}";
    }
}
