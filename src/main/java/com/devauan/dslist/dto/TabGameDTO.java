package com.devauan.dslist.dto;

import com.devauan.dslist.entities.TabGameObj;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class TabGameDTO {

    private Long cdGame;

    private String txTitle;

    private Integer vlYear;

    private String txImgUrl;

    private String txShortDescription;

    public TabGameDTO() {
    }

    public TabGameDTO(TabGameObj entity) {
        cdGame = entity.getCdGame();
        txTitle = entity.getTxTitle();
        vlYear = entity.getVlYear();
        txImgUrl = entity.getTxImgUrl();
        txShortDescription = entity.getTxShortDescription();
    }

    public Long getCdGame() {
        return cdGame;
    }

    public String getTxTitle() {
        return txTitle;
    }

    public Integer getVlYear() {
        return vlYear;
    }

    public String getTxImgUrl() {
        return txImgUrl;
    }

    public String getTxShortDescription() {
        return txShortDescription;
    }
}
