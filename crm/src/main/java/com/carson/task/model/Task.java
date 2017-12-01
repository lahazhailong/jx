package com.carson.task.model;

import com.carson.base.model.BaseDocument;
import com.carson.base.model.BaseObject;

import java.util.Date;

/**
 * @author Carson
 */
public class Task extends BaseDocument {

    private String name;

    private String desc;

    private String createdBy;

    private String owner;

    private Date createdDate;

    private Date complatedDate;

    private String status;

}
