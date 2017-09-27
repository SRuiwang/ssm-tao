package com.sr.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sr.batis.po.ItemCat;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemCatService extends BaseService<ItemCat>{

    private ObjectMapper om = new ObjectMapper();
}