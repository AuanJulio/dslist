package com.devauan.dslist.service;

import com.devauan.dslist.dto.TabGameCompleteDTO;
import com.devauan.dslist.dto.TabGameDTO;
import com.devauan.dslist.entities.TabGameObj;
import com.devauan.dslist.projections.TabGameMinProjection;
import com.devauan.dslist.repositories.TabGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TabGameService {

    @Autowired
    private TabGameRepository tabGameRepository;

    @Transactional(readOnly = true)
    public List<TabGameDTO> findAll() {
        List<TabGameObj> result = tabGameRepository.findAll();
        return result.stream().map(x -> new TabGameDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public TabGameCompleteDTO findById(Long id) {
        TabGameObj result = tabGameRepository.findById(id).get();
        return new TabGameCompleteDTO(result);
    }

    @Transactional(readOnly = true)
    public List<TabGameDTO> findByList(Long cdGameList) {
        List<TabGameMinProjection> result = tabGameRepository.searchByList(cdGameList);
        return result.stream().map(x -> new TabGameDTO(x)).toList();
    }
}
