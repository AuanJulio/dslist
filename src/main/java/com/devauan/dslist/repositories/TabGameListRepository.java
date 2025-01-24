package com.devauan.dslist.repositories;

import com.devauan.dslist.entities.TabGameListObj;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface TabGameListRepository extends JpaRepository<TabGameListObj, Long> {

    @Modifying
    @Query(nativeQuery = true,
            value = "UPDATE tab_belonging SET vl_position = :newPosition WHERE cd_game_list = :cdGameList AND cd_game = :cdGame")
    void updateBelongingPosition(Long cdGameList, Long cdGame, Integer newPosition);
}
