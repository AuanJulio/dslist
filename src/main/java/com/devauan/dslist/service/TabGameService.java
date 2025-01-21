package com.devauan.dslist.service;

import com.devauan.dslist.dto.TabGameDTO;
import com.devauan.dslist.entities.TabGameObj;
import com.devauan.dslist.repositories.TabGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TabGameService {

    @Autowired
    private TabGameRepository tabGameRepository;

    public List<TabGameDTO> findAll() {
        List<TabGameObj> result = tabGameRepository.findAll();
        return result.stream().map(x -> new TabGameDTO(x)).toList();
    }
}
