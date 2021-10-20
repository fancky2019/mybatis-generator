package com.example.mybatisgenerator.model.entity.online;

public class TagType {
    private Integer id;

    private String name;

    private Integer parentId;

    private Boolean isDeleted;

    private Long merchantId;

    private Long dataPermissionId;

    public TagType(Integer id, String name, Integer parentId, Boolean isDeleted, Long merchantId, Long dataPermissionId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.isDeleted = isDeleted;
        this.merchantId = merchantId;
        this.dataPermissionId = dataPermissionId;
    }

    public TagType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Boolean isDeleted) {
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
}