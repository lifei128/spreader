package com.nali.spreader.model;

import java.io.Serializable;
import java.util.Date;
import com.nali.common.model.BaseModel;

public class RealUser extends BaseModel implements Serializable {

    private String relationUidList;
    
    public String getRelationUidList() {
        return relationUidList;
    }
    
    public void setRelationUidList(String relationUidList) {
        this.relationUidList = relationUidList;
    }

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.uid
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Long uid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.website_uid
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Long websiteUid;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.website_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer websiteId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.user_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String userName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.email
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String email;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.nationality
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String nationality;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.province
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String province;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.city
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String city;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.district
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String district;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.sex
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String sex;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.qq
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String qq;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.msn
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String msn;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.nick_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String nickName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.real_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String realName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.id_card
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String idCard;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.birthday_year
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer birthdayYear;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.birthday_month
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer birthdayMonth;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.company_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String companyName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.company_address
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String companyAddress;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.home_address
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String homeAddress;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.university
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String university;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.junior_middle_school
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String juniorMiddleSchool;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.senior_middle_school
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String seniorMiddleSchool;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.interest
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String interest;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.skill
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String skill;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.create_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Date createTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.profession
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String profession;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.tags
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String tags;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.home_site
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String homeSite;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.intro
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String intro;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.signature
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private String signature;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.fans_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer fansCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.follow_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer followCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.blog_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer blogCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.photo_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer photoCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.video_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer videoCount;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column spreader.tb_real_user.voice_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    private Integer voiceCount;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.uid
     *
     * @return the value of spreader.tb_real_user.uid
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Long getUid() {
        return uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.uid
     *
     * @param uid the value for spreader.tb_real_user.uid
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setUid(Long uid) {
        this.uid = uid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.website_uid
     *
     * @return the value of spreader.tb_real_user.website_uid
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Long getWebsiteUid() {
        return websiteUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.website_uid
     *
     * @param websiteUid the value for spreader.tb_real_user.website_uid
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setWebsiteUid(Long websiteUid) {
        this.websiteUid = websiteUid;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.website_id
     *
     * @return the value of spreader.tb_real_user.website_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getWebsiteId() {
        return websiteId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.website_id
     *
     * @param websiteId the value for spreader.tb_real_user.website_id
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setWebsiteId(Integer websiteId) {
        this.websiteId = websiteId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.user_name
     *
     * @return the value of spreader.tb_real_user.user_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.user_name
     *
     * @param userName the value for spreader.tb_real_user.user_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.email
     *
     * @return the value of spreader.tb_real_user.email
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.email
     *
     * @param email the value for spreader.tb_real_user.email
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.nationality
     *
     * @return the value of spreader.tb_real_user.nationality
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.nationality
     *
     * @param nationality the value for spreader.tb_real_user.nationality
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.province
     *
     * @return the value of spreader.tb_real_user.province
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.province
     *
     * @param province the value for spreader.tb_real_user.province
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.city
     *
     * @return the value of spreader.tb_real_user.city
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.city
     *
     * @param city the value for spreader.tb_real_user.city
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.district
     *
     * @return the value of spreader.tb_real_user.district
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getDistrict() {
        return district;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.district
     *
     * @param district the value for spreader.tb_real_user.district
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setDistrict(String district) {
        this.district = district;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.sex
     *
     * @return the value of spreader.tb_real_user.sex
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.sex
     *
     * @param sex the value for spreader.tb_real_user.sex
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.qq
     *
     * @return the value of spreader.tb_real_user.qq
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getQq() {
        return qq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.qq
     *
     * @param qq the value for spreader.tb_real_user.qq
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setQq(String qq) {
        this.qq = qq;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.msn
     *
     * @return the value of spreader.tb_real_user.msn
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getMsn() {
        return msn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.msn
     *
     * @param msn the value for spreader.tb_real_user.msn
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setMsn(String msn) {
        this.msn = msn;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.nick_name
     *
     * @return the value of spreader.tb_real_user.nick_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getNickName() {
        return nickName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.nick_name
     *
     * @param nickName the value for spreader.tb_real_user.nick_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.real_name
     *
     * @return the value of spreader.tb_real_user.real_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.real_name
     *
     * @param realName the value for spreader.tb_real_user.real_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setRealName(String realName) {
        this.realName = realName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.id_card
     *
     * @return the value of spreader.tb_real_user.id_card
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.id_card
     *
     * @param idCard the value for spreader.tb_real_user.id_card
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.birthday_year
     *
     * @return the value of spreader.tb_real_user.birthday_year
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getBirthdayYear() {
        return birthdayYear;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.birthday_year
     *
     * @param birthdayYear the value for spreader.tb_real_user.birthday_year
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setBirthdayYear(Integer birthdayYear) {
        this.birthdayYear = birthdayYear;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.birthday_month
     *
     * @return the value of spreader.tb_real_user.birthday_month
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getBirthdayMonth() {
        return birthdayMonth;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.birthday_month
     *
     * @param birthdayMonth the value for spreader.tb_real_user.birthday_month
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setBirthdayMonth(Integer birthdayMonth) {
        this.birthdayMonth = birthdayMonth;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.company_name
     *
     * @return the value of spreader.tb_real_user.company_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.company_name
     *
     * @param companyName the value for spreader.tb_real_user.company_name
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.company_address
     *
     * @return the value of spreader.tb_real_user.company_address
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getCompanyAddress() {
        return companyAddress;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.company_address
     *
     * @param companyAddress the value for spreader.tb_real_user.company_address
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.home_address
     *
     * @return the value of spreader.tb_real_user.home_address
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getHomeAddress() {
        return homeAddress;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.home_address
     *
     * @param homeAddress the value for spreader.tb_real_user.home_address
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.university
     *
     * @return the value of spreader.tb_real_user.university
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getUniversity() {
        return university;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.university
     *
     * @param university the value for spreader.tb_real_user.university
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setUniversity(String university) {
        this.university = university;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.junior_middle_school
     *
     * @return the value of spreader.tb_real_user.junior_middle_school
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getJuniorMiddleSchool() {
        return juniorMiddleSchool;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.junior_middle_school
     *
     * @param juniorMiddleSchool the value for spreader.tb_real_user.junior_middle_school
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setJuniorMiddleSchool(String juniorMiddleSchool) {
        this.juniorMiddleSchool = juniorMiddleSchool;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.senior_middle_school
     *
     * @return the value of spreader.tb_real_user.senior_middle_school
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getSeniorMiddleSchool() {
        return seniorMiddleSchool;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.senior_middle_school
     *
     * @param seniorMiddleSchool the value for spreader.tb_real_user.senior_middle_school
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setSeniorMiddleSchool(String seniorMiddleSchool) {
        this.seniorMiddleSchool = seniorMiddleSchool;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.interest
     *
     * @return the value of spreader.tb_real_user.interest
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getInterest() {
        return interest;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.interest
     *
     * @param interest the value for spreader.tb_real_user.interest
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setInterest(String interest) {
        this.interest = interest;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.skill
     *
     * @return the value of spreader.tb_real_user.skill
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getSkill() {
        return skill;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.skill
     *
     * @param skill the value for spreader.tb_real_user.skill
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.create_time
     *
     * @return the value of spreader.tb_real_user.create_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.create_time
     *
     * @param createTime the value for spreader.tb_real_user.create_time
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.profession
     *
     * @return the value of spreader.tb_real_user.profession
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getProfession() {
        return profession;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.profession
     *
     * @param profession the value for spreader.tb_real_user.profession
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.tags
     *
     * @return the value of spreader.tb_real_user.tags
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getTags() {
        return tags;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.tags
     *
     * @param tags the value for spreader.tb_real_user.tags
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setTags(String tags) {
        this.tags = tags;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.home_site
     *
     * @return the value of spreader.tb_real_user.home_site
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getHomeSite() {
        return homeSite;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.home_site
     *
     * @param homeSite the value for spreader.tb_real_user.home_site
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setHomeSite(String homeSite) {
        this.homeSite = homeSite;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.intro
     *
     * @return the value of spreader.tb_real_user.intro
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getIntro() {
        return intro;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.intro
     *
     * @param intro the value for spreader.tb_real_user.intro
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.signature
     *
     * @return the value of spreader.tb_real_user.signature
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public String getSignature() {
        return signature;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.signature
     *
     * @param signature the value for spreader.tb_real_user.signature
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setSignature(String signature) {
        this.signature = signature;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.fans_count
     *
     * @return the value of spreader.tb_real_user.fans_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getFansCount() {
        return fansCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.fans_count
     *
     * @param fansCount the value for spreader.tb_real_user.fans_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setFansCount(Integer fansCount) {
        this.fansCount = fansCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.follow_count
     *
     * @return the value of spreader.tb_real_user.follow_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getFollowCount() {
        return followCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.follow_count
     *
     * @param followCount the value for spreader.tb_real_user.follow_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setFollowCount(Integer followCount) {
        this.followCount = followCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.blog_count
     *
     * @return the value of spreader.tb_real_user.blog_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getBlogCount() {
        return blogCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.blog_count
     *
     * @param blogCount the value for spreader.tb_real_user.blog_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.photo_count
     *
     * @return the value of spreader.tb_real_user.photo_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getPhotoCount() {
        return photoCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.photo_count
     *
     * @param photoCount the value for spreader.tb_real_user.photo_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setPhotoCount(Integer photoCount) {
        this.photoCount = photoCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.video_count
     *
     * @return the value of spreader.tb_real_user.video_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getVideoCount() {
        return videoCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.video_count
     *
     * @param videoCount the value for spreader.tb_real_user.video_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setVideoCount(Integer videoCount) {
        this.videoCount = videoCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column spreader.tb_real_user.voice_count
     *
     * @return the value of spreader.tb_real_user.voice_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public Integer getVoiceCount() {
        return voiceCount;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column spreader.tb_real_user.voice_count
     *
     * @param voiceCount the value for spreader.tb_real_user.voice_count
     *
     * @ibatorgenerated Thu Mar 31 15:40:02 CST 2011
     */
    public void setVoiceCount(Integer voiceCount) {
        this.voiceCount = voiceCount;
    }
}