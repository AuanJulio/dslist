package com.devauan.dslist.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tab_game_list")
public class TabGameListObj {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cd_game_list")
    private Long cdGameList;

    @Column(name = "tx_name")
    private String txName;

    public TabGameListObj() {
    }

    public TabGameListObj(Long cdGameList, String txName) {
        this.cdGameList = cdGameList;
        this.txName = txName;
    }

    public Long getCdGameList() {
        return cdGameList;
    }

    public void setCdGameList(Long cdGameList) {
        this.cdGameList = cdGameList;
    }

    public String getTxName() {
        return txName;
    }

    public void setTxName(String txName) {
        this.txName = txName;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TabGameListObj that = (TabGameListObj) o;
        return Objects.equals(cdGameList, that.cdGameList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cdGameList);
    }
}
