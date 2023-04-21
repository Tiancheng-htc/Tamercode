package com.handjoys.pojo;

/**
 * PostCard generated by MyEclipse - Hibernate Tools
 */
public class PostCard implements java.io.Serializable {

    private Long cardid;

    private String cardname;

    private Integer cardtype;

    private String cardtitle;

    private Integer price;

    private Long roomid;

    /** default constructor */
    public PostCard() {
    }

    /** minimal constructor */
    public PostCard(Long cardid) {
        this.cardid = cardid;
    }

    /** full constructor */
    public PostCard(Long cardid, String cardname, Integer cardtype, Long roomid) {
        this.cardid = cardid;
        this.cardname = cardname;
        this.cardtype = cardtype;
        this.roomid = roomid;
    }

    public Long getCardid() {
        return this.cardid;
    }

    public void setCardid(Long cardid) {
        this.cardid = cardid;
    }

    public String getCardname() {
        return this.cardname;
    }

    public void setCardname(String cardname) {
        this.cardname = cardname;
    }

    public Integer getCardtype() {
        return this.cardtype;
    }

    public void setCardtype(Integer cardtype) {
        this.cardtype = cardtype;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getCardtitle() {
        return cardtitle;
    }

    public void setCardtitle(String cardtitle) {
        this.cardtitle = cardtitle;
    }

    public Long getRoomid() {
        return roomid;
    }

    public void setRoomid(Long roomid) {
        this.roomid = roomid;
    }
}