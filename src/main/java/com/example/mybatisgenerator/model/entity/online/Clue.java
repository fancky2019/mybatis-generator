package com.example.mybatisgenerator.model.entity.online;

import java.time.LocalDateTime;

public class Clue {
    private Long id;

    private String clueName;

    private String userId;

    private String pwd;

    private String phone;

    private String seatPhone;

    private String phoneBak;

    private String email;

    private String postCode;

    private String birthday;

    private String region;

    private String customerId;

    private String currentStage;

    private String currentGrade;

    private String school;

    private String homeAddress;

    private String incomingIntent;

    private String intentLevel;

    private String gender;

    private String remark;

    private String initChannel;

    private String qqNumber;

    private String newChannel;

    private LocalDateTime lastCommunitedTime;

    private LocalDateTime nextCommuniteTime;

    private LocalDateTime activeTime;

    private Long followUserId;

    private Byte followStatus;

    private Byte forwardStatus;

    private Byte instituteStatus;

    private Byte signStatus;

    private Long createUserId;

    private Byte isDeleted;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private String studentId;

    private String seaAreaId;

    private String tagId;

    private String provinceCode;

    private String provinceValue;

    private String cityCode;

    private String cityValue;

    private String areaCode;

    private String areaValue;

    private Byte state;

    private String nickname;

    public Clue(Long id, String clueName, String userId, String pwd, String phone, String seatPhone, String phoneBak, String email, String postCode, String birthday, String region, String customerId, String currentStage, String currentGrade, String school, String homeAddress, String incomingIntent, String intentLevel, String gender, String remark, String initChannel, String qqNumber, String newChannel, LocalDateTime lastCommunitedTime, LocalDateTime nextCommuniteTime, LocalDateTime activeTime, Long followUserId, Byte followStatus, Byte forwardStatus, Byte instituteStatus, Byte signStatus, Long createUserId, Byte isDeleted, LocalDateTime createAt, LocalDateTime updateAt, String studentId, String seaAreaId, String tagId, String provinceCode, String provinceValue, String cityCode, String cityValue, String areaCode, String areaValue, Byte state, String nickname) {
        this.id = id;
        this.clueName = clueName;
        this.userId = userId;
        this.pwd = pwd;
        this.phone = phone;
        this.seatPhone = seatPhone;
        this.phoneBak = phoneBak;
        this.email = email;
        this.postCode = postCode;
        this.birthday = birthday;
        this.region = region;
        this.customerId = customerId;
        this.currentStage = currentStage;
        this.currentGrade = currentGrade;
        this.school = school;
        this.homeAddress = homeAddress;
        this.incomingIntent = incomingIntent;
        this.intentLevel = intentLevel;
        this.gender = gender;
        this.remark = remark;
        this.initChannel = initChannel;
        this.qqNumber = qqNumber;
        this.newChannel = newChannel;
        this.lastCommunitedTime = lastCommunitedTime;
        this.nextCommuniteTime = nextCommuniteTime;
        this.activeTime = activeTime;
        this.followUserId = followUserId;
        this.followStatus = followStatus;
        this.forwardStatus = forwardStatus;
        this.instituteStatus = instituteStatus;
        this.signStatus = signStatus;
        this.createUserId = createUserId;
        this.isDeleted = isDeleted;
        this.createAt = createAt;
        this.updateAt = updateAt;
        this.studentId = studentId;
        this.seaAreaId = seaAreaId;
        this.tagId = tagId;
        this.provinceCode = provinceCode;
        this.provinceValue = provinceValue;
        this.cityCode = cityCode;
        this.cityValue = cityValue;
        this.areaCode = areaCode;
        this.areaValue = areaValue;
        this.state = state;
        this.nickname = nickname;
    }

    public Clue() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getClueName() {
        return clueName;
    }

    public void setClueName(String clueName) {
        this.clueName = clueName == null ? null : clueName.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getSeatPhone() {
        return seatPhone;
    }

    public void setSeatPhone(String seatPhone) {
        this.seatPhone = seatPhone == null ? null : seatPhone.trim();
    }

    public String getPhoneBak() {
        return phoneBak;
    }

    public void setPhoneBak(String phoneBak) {
        this.phoneBak = phoneBak == null ? null : phoneBak.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId == null ? null : customerId.trim();
    }

    public String getCurrentStage() {
        return currentStage;
    }

    public void setCurrentStage(String currentStage) {
        this.currentStage = currentStage == null ? null : currentStage.trim();
    }

    public String getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(String currentGrade) {
        this.currentGrade = currentGrade == null ? null : currentGrade.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress == null ? null : homeAddress.trim();
    }

    public String getIncomingIntent() {
        return incomingIntent;
    }

    public void setIncomingIntent(String incomingIntent) {
        this.incomingIntent = incomingIntent == null ? null : incomingIntent.trim();
    }

    public String getIntentLevel() {
        return intentLevel;
    }

    public void setIntentLevel(String intentLevel) {
        this.intentLevel = intentLevel == null ? null : intentLevel.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getInitChannel() {
        return initChannel;
    }

    public void setInitChannel(String initChannel) {
        this.initChannel = initChannel == null ? null : initChannel.trim();
    }

    public String getQqNumber() {
        return qqNumber;
    }

    public void setQqNumber(String qqNumber) {
        this.qqNumber = qqNumber == null ? null : qqNumber.trim();
    }

    public String getNewChannel() {
        return newChannel;
    }

    public void setNewChannel(String newChannel) {
        this.newChannel = newChannel == null ? null : newChannel.trim();
    }

    public LocalDateTime getLastCommunitedTime() {
        return lastCommunitedTime;
    }

    public void setLastCommunitedTime(LocalDateTime lastCommunitedTime) {
        this.lastCommunitedTime = lastCommunitedTime;
    }

    public LocalDateTime getNextCommuniteTime() {
        return nextCommuniteTime;
    }

    public void setNextCommuniteTime(LocalDateTime nextCommuniteTime) {
        this.nextCommuniteTime = nextCommuniteTime;
    }

    public LocalDateTime getActiveTime() {
        return activeTime;
    }

    public void setActiveTime(LocalDateTime activeTime) {
        this.activeTime = activeTime;
    }

    public Long getFollowUserId() {
        return followUserId;
    }

    public void setFollowUserId(Long followUserId) {
        this.followUserId = followUserId;
    }

    public Byte getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Byte followStatus) {
        this.followStatus = followStatus;
    }

    public Byte getForwardStatus() {
        return forwardStatus;
    }

    public void setForwardStatus(Byte forwardStatus) {
        this.forwardStatus = forwardStatus;
    }

    public Byte getInstituteStatus() {
        return instituteStatus;
    }

    public void setInstituteStatus(Byte instituteStatus) {
        this.instituteStatus = instituteStatus;
    }

    public Byte getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(Byte signStatus) {
        this.signStatus = signStatus;
    }

    public Long getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Long createUserId) {
        this.createUserId = createUserId;
    }

    public Byte getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    public LocalDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(LocalDateTime createAt) {
        this.createAt = createAt;
    }

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    public String getSeaAreaId() {
        return seaAreaId;
    }

    public void setSeaAreaId(String seaAreaId) {
        this.seaAreaId = seaAreaId == null ? null : seaAreaId.trim();
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode == null ? null : provinceCode.trim();
    }

    public String getProvinceValue() {
        return provinceValue;
    }

    public void setProvinceValue(String provinceValue) {
        this.provinceValue = provinceValue == null ? null : provinceValue.trim();
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode == null ? null : cityCode.trim();
    }

    public String getCityValue() {
        return cityValue;
    }

    public void setCityValue(String cityValue) {
        this.cityValue = cityValue == null ? null : cityValue.trim();
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode == null ? null : areaCode.trim();
    }

    public String getAreaValue() {
        return areaValue;
    }

    public void setAreaValue(String areaValue) {
        this.areaValue = areaValue == null ? null : areaValue.trim();
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }
}