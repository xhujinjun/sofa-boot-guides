package com.github.xiejinjun.es.web.request;

import lombok.Data;

import java.util.List;

/**
 * @author xiejinjun
 * @version 2020/11/29
 */
@Data
public class ThesisCreateApiRequest{
    private Long thesisId;
    /**
     * 论文标题
     */
    private String title;

    /**
     * 论文来源ID
     */
    private Long thesisSourceId;

    /**
     * 论文来源
     */
    private String thesisSource;

    /**
     * 论文引用次数
     */
    private Long thesisReferenceNum;

    /**
     * 期刊名称
     */
    private String journalName;

    /**
     * 论文作者
     */
    private List<String> authorNames;

    /**
     * 论文发表日期
     */
    private Long submitDate;

    /**
     * 论文见刊日期
     */
    private Long publishedDate;

    /**
     * 论文类型
     */
    private Long thesisType;

    /**
     * 是否高被引，1是 2否
     */
    private Integer isHighCited;

    /**
     * 高被引证明文件
     */
    private String highCitedAttachment;

    /**
     * 论文类别
     */
    private String thesisCategories;

    /**
     * 共同第一作者数量
     */
    private Integer commonFirstAuthorCount;

    /**
     * 共同通讯作者数量
     */
    private Integer commonReportAuthorCount;
}
