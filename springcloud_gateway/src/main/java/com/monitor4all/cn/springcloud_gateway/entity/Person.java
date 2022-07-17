package com.monitor4all.cn.springcloud_gateway.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(
        name = "person"
        , indexes = {
          @Index(columnList = "id", name = "idx_id")
        , @Index(columnList = "name", name = "idx_name")
        }
)
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 20, columnDefinition = "varchar(30) not null default '啊哈哈'")
    private String name;

    @Column(name = "age", length = 4, columnDefinition = "tinyint")
    private int age;

    @Column(name = "remark", length = 200, nullable = false)
    private String remark;
}
