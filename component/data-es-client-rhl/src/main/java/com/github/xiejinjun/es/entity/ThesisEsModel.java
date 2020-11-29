package com.github.xiejinjun.es.entity;

import lombok.Data;
import org.zxp.esclientrhl.annotation.ESID;
import org.zxp.esclientrhl.annotation.ESMapping;
import org.zxp.esclientrhl.annotation.ESMetaData;
import org.zxp.esclientrhl.enums.DataType;

import java.util.List;

/**
 * @author xiejinjun
 * @version 2020/5/20
 */
@Data
@ESMetaData(indexName = "ehr_thesis", number_of_shards = 5, number_of_replicas = 1)
public class ThesisEsModel {
    /**
     * 论文ID
     */
    @ESID
    private Long thesisId;

    /**
     * 论文标题
     */
    @ESMapping(datatype = DataType.text_type)
    private String title;

    /**
     * 论文来源ID
     */
    @ESMapping(datatype = DataType.long_type)
    private Long thesisSourceId;

    /**
     * 论文来源
     */
    @ESMapping(datatype = DataType.keyword_type)
    private String thesisSource;

    /**
     * 论文引用次数
     */
    @ESMapping(datatype = DataType.long_type)
    private Long thesisReferenceNum;

    /**
     * 期刊名称
     */
    @ESMapping(datatype = DataType.keyword_type)
    private String journalName;

    /**
     * 论文作者
     */
    @ESMapping(datatype = DataType.text_type)
    private List<String> authorNames;

    /**
     * 论文发表日期
     */
    @ESMapping(datatype = DataType.long_type)
    private Long submitDate;

    /**
     * 论文见刊日期
     */
    @ESMapping(datatype = DataType.long_type)
    private Long publishedDate;

    /**
     * 论文类型
     */
    @ESMapping(datatype = DataType.long_type)
    private Long thesisType;

    /**
     * 是否高被引，1是 2否
     */
    @ESMapping(datatype = DataType.integer_type)
    private Integer isHighCited;

    /**
     * 高被引证明文件
     */
    @ESMapping(datatype = DataType.text_type)
    private String highCitedAttachment;

    /**
     * 论文类别
     */
    @ESMapping(datatype = DataType.text_type)
    private String thesisCategories;

    /**
     * 共同第一作者数量
     */
    @ESMapping(datatype = DataType.integer_type)
    private Integer commonFirstAuthorCount;

    /**
     * 共同通讯作者数量
     */
    @ESMapping(datatype = DataType.integer_type)
    private Integer commonReportAuthorCount;

}
