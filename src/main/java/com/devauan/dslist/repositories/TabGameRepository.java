package com.devauan.dslist.repositories;

import com.devauan.dslist.entities.TabGameObj;
import com.devauan.dslist.projections.TabGameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TabGameRepository extends JpaRepository<TabGameObj, Long> {

    @Query(nativeQuery = true, value = "SELECT tab_game.cd_game, tab_game.tx_title, tab_game.vl_year, " +
            "tab_game.tx_img_url, tab_game.tx_short_description, tab_belonging.vl_position " +
            "FROM tab_game " +
            "INNER JOIN tab_belonging ON tab_game.cd_game = tab_belonging.cd_game " +
            "WHERE tab_belonging.cd_game_list =:cdGameList " +
            "ORDER BY tab_belonging.vl_position")
    List<TabGameMinProjection> searchByList(Long cdGameList);
}
