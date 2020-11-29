package com.github.xiejinjun.es.web;

import com.github.xiejinjun.es.entity.ThesisEsModel;
import com.github.xiejinjun.es.service.ThesisService;
import com.github.xiejinjun.es.web.request.ThesisCreateApiRequest;
import com.github.xiejinjun.web.ApiRequest;
import com.github.xiejinjun.web.ApiResponse;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiejinjun
 * @version 2020/11/29
 */
@RestController
@RequestMapping("/thesis/manage")
public class ThesisController {
    @Autowired
    private ThesisService thesisService;

    @ApiOperation("检索论文")
    @PostMapping(value = "/create")
    public ApiResponse<String> save(@RequestBody ApiRequest<ThesisCreateApiRequest> apiRequest){
        ThesisCreateApiRequest thesisCreateApiRequest = apiRequest.getData();
        ThesisEsModel thesisEsModel = new ThesisEsModel();
        thesisEsModel.setThesisId(thesisEsModel.getThesisId());
        thesisEsModel.setTitle(thesisCreateApiRequest.getTitle());
        thesisEsModel.setThesisSourceId(thesisCreateApiRequest.getThesisSourceId());
        thesisEsModel.setThesisSource(thesisCreateApiRequest.getThesisSource());
        thesisEsModel.setThesisReferenceNum(thesisCreateApiRequest.getThesisReferenceNum());
        thesisEsModel.setJournalName(thesisCreateApiRequest.getJournalName());
        thesisEsModel.setAuthorNames(thesisCreateApiRequest.getAuthorNames());
        thesisEsModel.setSubmitDate(thesisCreateApiRequest.getSubmitDate());
        thesisEsModel.setPublishedDate(thesisCreateApiRequest.getPublishedDate());
        thesisEsModel.setThesisType(thesisCreateApiRequest.getThesisType());
        thesisEsModel.setIsHighCited(thesisCreateApiRequest.getIsHighCited());
        thesisEsModel.setHighCitedAttachment(thesisCreateApiRequest.getHighCitedAttachment());
        thesisEsModel.setThesisCategories(thesisCreateApiRequest.getThesisCategories());
        thesisEsModel.setCommonFirstAuthorCount(thesisCreateApiRequest.getCommonFirstAuthorCount());
        thesisEsModel.setCommonReportAuthorCount(thesisCreateApiRequest.getCommonReportAuthorCount());

        thesisService.save(thesisEsModel);
        return ApiResponse.success("OK");
    }
}
