package com.example.devjob;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Techstack {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 스택 코드명
    private String title;
    private String version;
    private Boolean required; // 필수 여부

    @ManyToOne
    //@JoinColumn(name = "jobpost_id")
    private Jobpost jobpost;
}
