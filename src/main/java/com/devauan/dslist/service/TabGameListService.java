package com.devauan.dslist.service;

import com.devauan.dslist.dto.TabGameListDTO;
import com.devauan.dslist.entities.TabGameListObj;
import com.devauan.dslist.repositories.TabGameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TabGameListService {

    @Autowired
    private TabGameListRepository tabGameListRepository;

    @Transactional(readOnly = true)
    public List<TabGameListDTO> findAll() {
        List<TabGameListObj> result = tabGameListRepository.findAll();
        return result.stream().map(x -> new TabGameListDTO(x)).toList();
    }
}
