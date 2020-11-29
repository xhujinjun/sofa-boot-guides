package com.github.xiejinjun.es.service;

import com.github.xiejinjun.es.entity.ThesisEsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zxp.esclientrhl.repository.ElasticsearchTemplate;

/**
 * @author xiejinjun
 * @version 2020/11/29
 */
@Service
public class ThesisService {
    @Autowired
    private ElasticsearchTemplate<ThesisEsModel, Long> elasticsearchTemplate;

    public void save(ThesisEsModel esModel){
        try {
            elasticsearchTemplate.save(esModel);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
