package com.sia.domain;

import java.util.Date;

import lombok.Data;

@Data
public class AttendenceDTO {
    private Date classDate;
    private String userId;
    private String classId;
    private String academyId;
    private String attendenceType;
    private String memo;

}
