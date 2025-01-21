package com.devauan.dslist.controllers;

import com.devauan.dslist.dto.TabGameDTO;
import com.devauan.dslist.entities.TabGameObj;
import com.devauan.dslist.service.TabGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/games")
public class TabGameController {

    @Autowired
    private TabGameService tabGameService;

    @GetMapping
    public List<TabGameDTO> findAll() {
        return tabGameService.findAll();
    }
}
