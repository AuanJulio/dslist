package com.devauan.dslist.entities;

import jakarta.persistence.*;

import java.beans.ConstructorProperties;
import java.util.Objects;

@Entity
@Table(name = "tab_game")
public class TabGameObj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_game")
    private Long cdGame;

    @Column(name = "tx_title")
    private String txTitle;

    @Column(name = "vl_year")
    private Integer vlYear;

    @Column(name = "tx_genre")
    private String txGenre;

    @Column(name = "tx_img_url")
    private String txImgUrl;

    @Column(name = "tx_short_description", columnDefinition = "TEXT")
    private String txShortDescription;

    @Column(name = "tx_long_description", columnDefinition = "TEXT")
    private String txLongDescription;

    @Column(name = "tx_platforms")
    private String txPlatforms;

    @Column(name = "vl_score")
    private Double vlScore;

    public TabGameObj() {
    }

    public TabGameObj(Long cdGame, String txTitle, Integer vlYear, String txGenre, String txImgUrl, String txShortDescription) {
        this.cdGame = cdGame;
        this.txTitle = txTitle;
        this.vlYear = vlYear;
        this.txGenre = txGenre;
        this.txImgUrl = txImgUrl;
        this.txShortDescription = txShortDescription;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabGameObj other = (TabGameObj) o;
        return Objects.equals(cdGame, other.cdGame);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cdGame);
    }
}
