package com.devauan.dslist.controllers;

import com.devauan.dslist.dto.ReplacementDTO;
import com.devauan.dslist.dto.TabGameCompleteDTO;
import com.devauan.dslist.dto.TabGameDTO;
import com.devauan.dslist.dto.TabGameListDTO;
import com.devauan.dslist.service.TabGameListService;
import com.devauan.dslist.service.TabGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class TabGameListController {

    @Autowired
    private TabGameListService tabGameListService;

    @Autowired
    private TabGameService tabGameService;

    @GetMapping
    public List<TabGameListDTO> findAll() {
        return tabGameListService.findAll();
    }

    @GetMapping(value = "/{cdGameList}/games")
    public List<TabGameDTO> findByList(@PathVariable Long cdGameList) {
        return tabGameService.findByList(cdGameList);
    }

    @PostMapping(value = "/{cdGameList}/replacement")
    public void move(@PathVariable Long cdGameList, @RequestBody ReplacementDTO body) {
        tabGameListService.move(cdGameList, body.getSourceIndex(), body.getDestinationIndex());
    }
}
