package com.devauan.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "tab_belonging")
public class TabBelongingObj {

    @EmbeddedId
    private TabBelongingPkObj tabBelongingPkObj = new TabBelongingPkObj();

    private Integer vlPosition;

    public TabBelongingObj() {
    }

    public TabBelongingObj(TabGameObj tabGameObj, TabGameListObj tabGameListObj, Integer vlPosition) {
        tabBelongingPkObj.setTabGameObj(tabGameObj);
        tabBelongingPkObj.setTabGameListObj(tabGameListObj);
        this.vlPosition = vlPosition;
    }

    public TabBelongingPkObj getTabBelongingPkObj() {
        return tabBelongingPkObj;
    }

    public void setTabBelongingPkObj(TabBelongingPkObj tabBelongingPkObj) {
        this.tabBelongingPkObj = tabBelongingPkObj;
    }

    public Integer getVlPosition() {
        return vlPosition;
    }

    public void setVlPosition(Integer vlPosition) {
        this.vlPosition = vlPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        TabBelongingObj that = (TabBelongingObj) o;
        return Objects.equals(tabBelongingPkObj, that.tabBelongingPkObj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(tabBelongingPkObj);
    }
}
