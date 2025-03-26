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
 * 体育
 *
 * @author 
 * @email
 */
@TableName("tiyu")
public class TiyuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public TiyuEntity() {

	}

	public TiyuEntity(T t) {
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
     * 体育名称
     */
    @TableField(value = "tiyu_name")

    private String tiyuName;


    /**
     * 体育照片
     */
    @TableField(value = "tiyu_photo")

    private String tiyuPhoto;


    /**
     * 体育视频
     */
    @TableField(value = "tiyu_video")

    private String tiyuVideo;


    /**
     * 体育类型
     */
    @TableField(value = "tiyu_types")

    private Integer tiyuTypes;


    /**
     * 点击次数
     */
    @TableField(value = "tiyu_clicknum")

    private Integer tiyuClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "tiyu_delete")

    private Integer tiyuDelete;


    /**
     * 体育简介
     */
    @TableField(value = "tiyu_content")

    private String tiyuContent;


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
	 * 设置：体育名称
	 */
    public String getTiyuName() {
        return tiyuName;
    }


    /**
	 * 获取：体育名称
	 */

    public void setTiyuName(String tiyuName) {
        this.tiyuName = tiyuName;
    }
    /**
	 * 设置：体育照片
	 */
    public String getTiyuPhoto() {
        return tiyuPhoto;
    }


    /**
	 * 获取：体育照片
	 */

    public void setTiyuPhoto(String tiyuPhoto) {
        this.tiyuPhoto = tiyuPhoto;
    }
    /**
	 * 设置：体育视频
	 */
    public String getTiyuVideo() {
        return tiyuVideo;
    }


    /**
	 * 获取：体育视频
	 */

    public void setTiyuVideo(String tiyuVideo) {
        this.tiyuVideo = tiyuVideo;
    }
    /**
	 * 设置：体育类型
	 */
    public Integer getTiyuTypes() {
        return tiyuTypes;
    }


    /**
	 * 获取：体育类型
	 */

    public void setTiyuTypes(Integer tiyuTypes) {
        this.tiyuTypes = tiyuTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getTiyuClicknum() {
        return tiyuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setTiyuClicknum(Integer tiyuClicknum) {
        this.tiyuClicknum = tiyuClicknum;
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
    public Integer getTiyuDelete() {
        return tiyuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setTiyuDelete(Integer tiyuDelete) {
        this.tiyuDelete = tiyuDelete;
    }
    /**
	 * 设置：体育简介
	 */
    public String getTiyuContent() {
        return tiyuContent;
    }


    /**
	 * 获取：体育简介
	 */

    public void setTiyuContent(String tiyuContent) {
        this.tiyuContent = tiyuContent;
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
        return "Tiyu{" +
            "id=" + id +
            ", tiyuName=" + tiyuName +
            ", tiyuPhoto=" + tiyuPhoto +
            ", tiyuVideo=" + tiyuVideo +
            ", tiyuTypes=" + tiyuTypes +
            ", tiyuClicknum=" + tiyuClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", tiyuDelete=" + tiyuDelete +
            ", tiyuContent=" + tiyuContent +
            ", createTime=" + createTime +
        "}";
    }
}
