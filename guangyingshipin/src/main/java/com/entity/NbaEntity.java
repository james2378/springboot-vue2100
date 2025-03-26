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
 * NBA
 *
 * @author 
 * @email
 */
@TableName("nba")
public class NbaEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public NbaEntity() {

	}

	public NbaEntity(T t) {
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
     * NBA名称
     */
    @TableField(value = "nba_name")

    private String nbaName;


    /**
     * NBA照片
     */
    @TableField(value = "nba_photo")

    private String nbaPhoto;


    /**
     * NBA视频
     */
    @TableField(value = "nba_video")

    private String nbaVideo;


    /**
     * NBA类型
     */
    @TableField(value = "nba_types")

    private Integer nbaTypes;


    /**
     * 点击次数
     */
    @TableField(value = "nba_clicknum")

    private Integer nbaClicknum;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "nba_delete")

    private Integer nbaDelete;


    /**
     * NBA简介
     */
    @TableField(value = "nba_content")

    private String nbaContent;


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
	 * 设置：NBA名称
	 */
    public String getNbaName() {
        return nbaName;
    }


    /**
	 * 获取：NBA名称
	 */

    public void setNbaName(String nbaName) {
        this.nbaName = nbaName;
    }
    /**
	 * 设置：NBA照片
	 */
    public String getNbaPhoto() {
        return nbaPhoto;
    }


    /**
	 * 获取：NBA照片
	 */

    public void setNbaPhoto(String nbaPhoto) {
        this.nbaPhoto = nbaPhoto;
    }
    /**
	 * 设置：NBA视频
	 */
    public String getNbaVideo() {
        return nbaVideo;
    }


    /**
	 * 获取：NBA视频
	 */

    public void setNbaVideo(String nbaVideo) {
        this.nbaVideo = nbaVideo;
    }
    /**
	 * 设置：NBA类型
	 */
    public Integer getNbaTypes() {
        return nbaTypes;
    }


    /**
	 * 获取：NBA类型
	 */

    public void setNbaTypes(Integer nbaTypes) {
        this.nbaTypes = nbaTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getNbaClicknum() {
        return nbaClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setNbaClicknum(Integer nbaClicknum) {
        this.nbaClicknum = nbaClicknum;
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
    public Integer getNbaDelete() {
        return nbaDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setNbaDelete(Integer nbaDelete) {
        this.nbaDelete = nbaDelete;
    }
    /**
	 * 设置：NBA简介
	 */
    public String getNbaContent() {
        return nbaContent;
    }


    /**
	 * 获取：NBA简介
	 */

    public void setNbaContent(String nbaContent) {
        this.nbaContent = nbaContent;
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
        return "Nba{" +
            "id=" + id +
            ", nbaName=" + nbaName +
            ", nbaPhoto=" + nbaPhoto +
            ", nbaVideo=" + nbaVideo +
            ", nbaTypes=" + nbaTypes +
            ", nbaClicknum=" + nbaClicknum +
            ", shangxiaTypes=" + shangxiaTypes +
            ", nbaDelete=" + nbaDelete +
            ", nbaContent=" + nbaContent +
            ", createTime=" + createTime +
        "}";
    }
}
