package com.example.devjob.location;

import com.example.devjob.jobpost.Jobpost;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 주소 서울 경기
    private String region;

    // 상세주소
    private String address;

    @ManyToOne
    //@JoinColumn(name = "jobpost_id")
    private Jobpost jobpost;
}
