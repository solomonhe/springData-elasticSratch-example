package com.solomon.springdataelasticsearch;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

import java.math.BigDecimal;
import java.util.Date;

/**
 * FaceRecogRecord
 *
 * @author Solomon
 * @date 2020/05/09
 */
@Data
@Document(indexName = "face_recog_record")  //索引名称 必填字段
public class FaceRecogRecord {
    /**
     * brilliants_face_recognition..face_recog_record.id
     */
    @Id
    private String id;

    /**
     * brilliants_face_recognition..face_recog_record.app_id
     */
    private String appId;

    /**
     * brilliants_face_recognition..face_recog_record.person_id
     */
    private String personId;

    /**
     * brilliants_face_recognition..face_recog_record.face_id
     */
    private String faceId;

    /**
     * brilliants_face_recognition..face_recog_record.person_type
     */
    private Byte personType;

    /**
     * brilliants_face_recognition..face_recog_record.person_code
     */
    private String personCode;

    /**
     * brilliants_face_recognition..face_recog_record.person_name
     */
    private String personName;

    /**
     * brilliants_face_recognition..face_recog_record.person_id_num
     */
    private String personIdNum;

    /**
     * brilliants_face_recognition..face_recog_record.person_ic_num
     */
    private String personIcNum;

    /**
     * brilliants_face_recognition..face_recog_record.person_ethnic
     */
    private String personEthnic;

    /**
     * brilliants_face_recognition..face_recog_record.person_gender
     */
    private Byte personGender;

    /**
     * brilliants_face_recognition..face_recog_record.person_birthday
     */
    private Date personBirthday;

    /**
     * brilliants_face_recognition..face_recog_record.person_address
     */
    private String personAddress;

    /**
     * brilliants_face_recognition..face_recog_record.person_id_issuing_organ
     */
    private String personIdIssuingOrgan;

    /**
     * brilliants_face_recognition..face_recog_record.person_id_useful_life
     */
    private String personIdUsefulLife;

    /**
     * brilliants_face_recognition..face_recog_record.person_job
     */
    private String personJob;

    /**
     * brilliants_face_recognition..face_recog_record.person_group_id
     */
    private String personGroupId;

    /**
     * brilliants_face_recognition..face_recog_record.device_type
     */
    private Byte deviceType;

    /**
     * brilliants_face_recognition..face_recog_record.device_group_id
     */
    private String deviceGroupId;

    /**
     * brilliants_face_recognition..face_recog_record.device_id
     */
    private String deviceId;

    /**
     * brilliants_face_recognition..face_recog_record.device_name
     */
    private String deviceName;

    /**
     * brilliants_face_recognition..face_recog_record.section_id
     */
    private String sectionId;

    /**
     * brilliants_face_recognition..face_recog_record.section_name
     */
    private String sectionName;

    /**
     * brilliants_face_recognition..face_recog_record.interviewee_id
     */
    private String intervieweeId;

    /**
     * brilliants_face_recognition..face_recog_record.interviewee_name
     */
    private String intervieweeName;

    /**
     * brilliants_face_recognition..face_recog_record.day_count
     */
    private Integer dayCount;

    /**
     * brilliants_face_recognition..face_recog_record.inout_flag
     */
    private Byte inoutFlag;

    /**
     * brilliants_face_recognition..face_recog_record.snap_pic
     */
    private String snapPic;

    /**
     * brilliants_face_recognition..face_recog_record.compare_pic
     */
    private String comparePic;

    /**
     * brilliants_face_recognition..face_recog_record.score
     */
    private Byte score;

    /**
     * brilliants_face_recognition..face_recog_record.matched
     */
    private Boolean matched;

    /**
     * brilliants_face_recognition..face_recog_record.expired
     */
    private Boolean expired;

    /**
     * brilliants_face_recognition..face_recog_record.status
     */
    private Byte status;

    /**
     * brilliants_face_recognition..face_recog_record.snap_time
     */
    private Date snapTime;

    /**
     * brilliants_face_recognition..face_recog_record.body_temp
     */
    private BigDecimal bodyTemp;

    /**
     * brilliants_face_recognition..face_recog_record.create_time
     */
    private Date createTime;

    /**
     * brilliants_face_recognition..face_recog_record.update_time
     */
    private Date updateTime;

}
