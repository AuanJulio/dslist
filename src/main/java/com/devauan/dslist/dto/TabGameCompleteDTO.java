package com.devauan.dslist.dto;

import com.devauan.dslist.entities.TabGameObj;
import org.springframework.beans.BeanUtils;

public class TabGameCompleteDTO {

    private Long cdGame;

    private String txTitle;

    private Integer vlYear;

    private String txGenre;

    private String txImgUrl;

    private String txShortDescription;

    private String txLongDescription;

    private String txPlatforms;

    private Double vlScore;

    public TabGameCompleteDTO() {}

    public TabGameCompleteDTO (TabGameObj tabGameObj) {
        BeanUtils.copyProperties(tabGameObj, this);
    }

    public Long getCdGame() {
        return cdGame;
    }

    public void setCdGame(Long cdGame) {
        this.cdGame = cdGame;
    }

    public String getTxTitle() {
        return txTitle;
    }

    public void setTxTitle(String txTitle) {
        this.txTitle = txTitle;
    }

    public Integer getVlYear() {
        return vlYear;
    }

    public void setVlYear(Integer vlYear) {
        this.vlYear = vlYear;
    }

    public String getTxGenre() {
        return txGenre;
    }

    public void setTxGenre(String txGenre) {
        this.txGenre = txGenre;
    }

    public String getTxImgUrl() {
        return txImgUrl;
    }

    public void setTxImgUrl(String txImgUrl) {
        this.txImgUrl = txImgUrl;
    }

    public String getTxShortDescription() {
        return txShortDescription;
    }

    public void setTxShortDescription(String txShortDescription) {
        this.txShortDescription = txShortDescription;
    }

    public String getTxLongDescription() {
        return txLongDescription;
    }

    public void setTxLongDescription(String txLongDescription) {
        this.txLongDescription = txLongDescription;
    }

    public String getTxPlatforms() {
        return txPlatforms;
    }

    public void setTxPlatforms(String txPlatforms) {
        this.txPlatforms = txPlatforms;
    }

    public Double getVlScore() {
        return vlScore;
    }

    public void setVlScore(Double vlScore) {
        this.vlScore = vlScore;
    }
}
