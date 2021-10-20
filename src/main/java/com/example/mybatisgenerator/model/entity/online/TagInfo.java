package com.example.mybatisgenerator.model.entity.online;

import java.time.LocalDateTime;

public class TagInfo {
    private Long id;

    private String tagCode;

    private String tagName;

    private LocalDateTime createAt;

    private Byte tagType;

    private LocalDateTime updateAt;

    private Long createBy;

    private Long updateBy;

    private Byte isDeleted;

    private Long merchantId;

    private Long dataPermissionId;

    private Integer tagTypeId;

    private Boolean isInitiative;

    private String remark;

    private Boolean isEnable;

    public TagInfo(Long id, String tagCode, String tagName, LocalDateTime createAt, Byte tagType, LocalDateTime updateAt, Long createBy, Long updateBy, Byte isDeleted, Long merchantId, Long dataPermissionId, Integer tagTypeId, Boolean isInitiative, String remark, Boolean isEnable) {
        this.id = id;
        this.tagCode = tagCode;
        this.tagName = tagName;
        this.createAt = createAt;
        this.tagType = tagType;
        this.updateAt = updateAt;
        this.createBy = createBy;
        this.updateBy = updateBy;
        this.isDeleted = isDeleted;
        this.merchantId = merchantId;
        this.dataPermissionId = dataPermissionId;
        this.tagTypeId = tagTypeId;
        this.isInitiative = isInitiative;
        this.remark = remark;
        this.isEnable = isEnable;
    }

    public TagInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTagCode() {
        return tagCode;
    }

    public void setTagCode(String tagCode) {
        this.tagCode = tagCode == null ? null : tagCode.trim();
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public Byte getTagType() {
        return tagType;
    }

    public void setTagType(Byte tagType) {
        this.tagType = tagType;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Long getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Long updateBy) {
        this.updateBy = updateBy;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getDataPermissionId() {
        return dataPermissionId;
    }

    public void setDataPermissionId(Long dataPermissionId) {
        this.dataPermissionId = dataPermissionId;
    }

    public Integer getTagTypeId() {
        return tagTypeId;
    }

    public void setTagTypeId(Integer tagTypeId) {
        this.tagTypeId = tagTypeId;
    }

    public Boolean getIsInitiative() {
        return isInitiative;
    }

    public void setIsInitiative(Boolean isInitiative) {
        this.isInitiative = isInitiative;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }
}