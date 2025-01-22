package com.devauan.dslist.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.util.Objects;

@Embeddable
public class TabBelongingPkObj {

    @ManyToOne
    @JoinColumn(name = "cd_game")
    private TabGameObj tabGameObj;

    @ManyToOne
    @JoinColumn(name = "cd_game_list")
    private TabGameListObj tabGameListObj;

    public TabBelongingPkObj() {
    }

    public TabBelongingPkObj(TabGameObj tabGameObj, TabGameListObj tabGameListObj) {
        this.tabGameObj = tabGameObj;
        this.tabGameListObj = tabGameListObj;
    }

    public TabGameObj getTabGameObj() {
        return tabGameObj;
    }

    public void setTabGameObj(TabGameObj tabGameObj) {
        this.tabGameObj = tabGameObj;
    }

    public TabGameListObj getTabGameListObj() {
        return tabGameListObj;
    }

    public void setTabGameListObj(TabGameListObj tabGameListObj) {
        this.tabGameListObj = tabGameListObj;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TabBelongingPkObj that = (TabBelongingPkObj) o;
        return Objects.equals(tabGameObj, that.tabGameObj) && Objects.equals(tabGameListObj, that.tabGameListObj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tabGameObj, tabGameListObj);
    }
}
