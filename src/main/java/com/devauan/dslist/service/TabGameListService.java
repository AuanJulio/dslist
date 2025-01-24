package com.devauan.dslist.service;

import com.devauan.dslist.dto.TabGameListDTO;
import com.devauan.dslist.entities.TabGameListObj;
import com.devauan.dslist.projections.TabGameMinProjection;
import com.devauan.dslist.repositories.TabGameListRepository;
import com.devauan.dslist.repositories.TabGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TabGameListService {

    @Autowired
    private TabGameListRepository tabGameListRepository;

    @Autowired
    private TabGameRepository tabGameRepository;

    @Transactional(readOnly = true)
    public List<TabGameListDTO> findAll() {
        List<TabGameListObj> result = tabGameListRepository.findAll();
        return result.stream().map(x -> new TabGameListDTO(x)).toList();
    }

    @Transactional
    public void move (Long cdGameList, int sourceIndex, int destinationIndex) {
        List<TabGameMinProjection> list = tabGameRepository.searchByList(cdGameList);
        TabGameMinProjection obj = list.remove(sourceIndex);
        list.add(destinationIndex, obj);

        int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
        int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;

        for (int i = min; i <= max; i++) {
            tabGameListRepository.updateBelongingPosition(cdGameList, list.get(i).getCdGame(), i);
        }
    }
}
