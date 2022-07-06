package com.Course.Course.Management.System.Model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name="course1")
@SQLDelete(sql = "UPDATE course1 SET deleted = true WHERE id=?")
@Where(clause = "deleted=false")

public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private String name;
    private String title;
    private  String author;
    private  String description;
    private Boolean Deleted=Boolean.FALSE;

}
