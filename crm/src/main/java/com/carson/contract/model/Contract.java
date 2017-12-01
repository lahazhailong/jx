package com.carson.contract.model;

import com.carson.base.model.BaseDocument;
import com.carson.task.model.Task;

import java.util.Date;
import java.util.List;

/**
 * @author Carson
 */
public class Contract extends BaseDocument {

    private String number;

    private String desc;

    private Date createdDate;

    private Date completedDate;

    private String status;

    private List<Task> tasks;


}
