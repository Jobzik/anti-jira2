package com.app.model;

public class Ticket {
//--------------------ATTRIBUTES-------------------
    private long id;
    private String summary;
    private String description;
    private Status statusId;
    private User reporterId;
    private User assignId;
    private String type;
    private Sprint sprintId;
    private Label labelId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatusId() {
        return statusId;
    }

    public void setStatusId(Status statusId) {
        this.statusId = statusId;
    }

    public User getReporterId() {
        return reporterId;
    }

    public void setReporterId(User reporterId) {
        this.reporterId = reporterId;
    }

    public User getAssignId() {
        return assignId;
    }

    public void setAssignId(User assignId) {
        this.assignId = assignId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Sprint getSprintId() {
        return sprintId;
    }

    public void setSprintId(Sprint sprintId) {
        this.sprintId = sprintId;
    }

    public Label getLabelId() {
        return labelId;
    }

    public void setLabelId(Label labelId) {
        this.labelId = labelId;
    }
}