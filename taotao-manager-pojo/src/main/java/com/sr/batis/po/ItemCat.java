package com.sr.batis.po;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_item_cat")
public class ItemCat extends BasePoJo {
    /*
    CREATE TABLE `tb_item_cat` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '类目ID',
    `parent_id` bigint(20) DEFAULT NULL COMMENT '父类目ID=0时，代表的是一级的类目',
    `name      ` varchar(50) DEFAULT NULL COMMENT '类目名称',
    `status     ` int(1) DEFAULT '1' COMMENT '状态。可选值:1(正常),2(删除)',
    `sort_order ` int(4) DEFAULT NULL COMMENT '排列序号，表示同级类目的展现次序，如数值相等则按名称次序排列。取值范围:大于零的整数',
    `is_parent  ` tinyint(1) DEFAULT '1' COMMENT '该类目是否为父类目，1为true，0为false',
    `created    ` datetime DEFAULT NULL COMMENT '创建时间',
    `updated    ` datetime DEFAULT NULL COMMENT '创建时间',
    PRIMARY KEY (`id`),
    KEY `parent_id` (`parent_id`,`status`) USING BTREE,
    KEY `sort_order` (`sort_order`)
    ) ENGINE=InnoDB AUTO_INCREMENT=1183 DEFAULT CHARSET=utf8 COMMENT='商品类目'
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long parentId;
    private String name;
    private String status;
    private Integer sortOrder;
    private Boolean isParent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Boolean getParent() {
        return isParent;
    }

    public void setParent(Boolean parent) {
        isParent = parent;
    }
}