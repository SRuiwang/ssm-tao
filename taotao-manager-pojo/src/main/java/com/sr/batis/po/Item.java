package com.sr.batis.po;

import com.fasterxml.jackson.databind.deser.Deserializers;

import javax.persistence.*;

@Table(name = "tb_item")
public class Item extends BasePoJo {

    /*
    CREATE TABLE `tb_item` (
  `id                       `         bigint(20) NOT NULL COMMENT '商品id，同时也是商品编号',
  `title            `      varchar(100) NOT NULL COMMENT '商品标题',
  `sell_point   `    varchar(500) DEFAULT NULL COMMENT '商品卖点',
  `price                `        bigint(20) NOT NULL COMMENT '商品价格，单位为：分',
  `num              `             int(10) NOT NULL COMMENT '库存数量',
  `barcode                          `                 varchar(30) DEFAULT NULL COMMENT '商品条形码',
  `image        `               varchar(500) DEFAULT NULL COMMENT '商品图片',
  `cid          `                 bigint(10) NOT NULL COMMENT '所属类目，叶子类目',
  `status       `                  tinyint(4) NOT NULL DEFAULT '1' COMMENT '商品状态，1-正常，2-下架，3-删除',
  `created              `                 datetime NOT NULL COMMENT '创建时间',
  `updated              `             datetime NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`),
  KEY `cid` (`cid`),
  KEY `status` (`status`),
  KEY `updated` (`updated`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='商品表'
     */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    @Column(name = "sell_point")
    private String sellPoint;
    private Long price;
    private Integer num;
    private String barcode;
    private String image;
    private Long cid;
    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSellPoint() {
        return sellPoint;
    }

    public void setSellPoint(String sellPoint) {
        this.sellPoint = sellPoint;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}