package com.devauan.dslist.controllers;

import com.devauan.dslist.dto.TabGameCompleteDTO;
import com.devauan.dslist.dto.TabGameDTO;
import com.devauan.dslist.dto.TabGameListDTO;
import com.devauan.dslist.service.TabGameListService;
import com.devauan.dslist.service.TabGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class TabGameListController {

    @Autowired
    private TabGameListService tabGameListService;

    @GetMapping
    public List<TabGameListDTO> findAll() {
        return tabGameListService.findAll();
    }
}
