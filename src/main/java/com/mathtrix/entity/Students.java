package com.mathtrix.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Student_Info")
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "SL_NO")
    private Long slNo;
    @Column(name="Name")
    private String name;
    @Column(name="contact_no")
    private String contactNo;
    @Column(name="University")
    private String university;
    @Column(name="Date_of_Admission")
    private Date timeOfAdmission;

    @Override
    public String toString() {
        return "Students{" +
                "slNo=" + slNo +
                ", name='" + name + '\'' +
                ", contactNo='" + contactNo + '\'' +
                ", university='" + university + '\'' +
                ", timeOfAdmission=" + timeOfAdmission +
                '}';
    }
}
