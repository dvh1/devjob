//
package com.example.devjob;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Jobpost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50)
    private String company; // 회사명

    @Column(length = 200)
    private String title;//jobtitle

    //careerStart 신입 0~0 0~1
    private int careerStart;
    private int careerEnd;
    // 급여 단 3000 범위 ~3500 or 미정
    private int salaryStart;
    private int salaryEnd;
    // 학력
    private String education;
    // 근무지역1 2
    //private String location1; // 서울 경기
    //private String location2; // 근무지역 여러개
    @OneToMany(mappedBy = "jobpost", cascade = CascadeType.REMOVE)
    private List<Location> locationList;

    // 근무형태
    private String worktype;

    // 스택
    @OneToMany(mappedBy = "jobpost", cascade = CascadeType.REMOVE)
    private List<Techstack> techstackList;

    @Column(columnDefinition = "TEXT")
    private String content;


    private LocalDateTime createDate;
    private LocalDateTime startDate; // 시작일
    private LocalDateTime endDate; // 마감일 끝


    // 조회수
    private Integer view;


    //사용기술 기술스택 필수
    //우대
    //지원링크
    private String link;
}
