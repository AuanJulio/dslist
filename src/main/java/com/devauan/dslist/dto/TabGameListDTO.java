package com.devauan.dslist.dto;

import com.devauan.dslist.entities.TabGameListObj;

public class TabGameListDTO {

    private Long cdGameList;

    private String txName;

    public TabGameListDTO() {}

    public TabGameListDTO(TabGameListObj tabGameListObj) {
        cdGameList = tabGameListObj.getCdGameList();
        txName = tabGameListObj.getTxName();
    }

    public Long getCdGameList() {
        return cdGameList;
    }

    public String getTxName() {
        return txName;
    }
}
