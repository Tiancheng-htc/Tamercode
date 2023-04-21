package com.astrium.faceo.client.bean.programming.sps2.validate;

import java.io.Serializable;
import java.util.ArrayList;

/**
public class ValidateRequestBean implements Serializable {

    /**
    private static final long serialVersionUID = 7385188865588652920L;

    /** sensor urn identifier */
    private String sensorUrn = null;

    /** task identifier */
    private String taskId = null;

    /** task user */
    private String user = null;

    /** task name */
    private String name = null;

    /** List of segments identifiers */
    private ArrayList<String> segmentsId = new ArrayList<String>();

    /**
    public ValidateRequestBean() {
    }

    /** 
    public String getTaskId() {
        return (this.taskId != null) ? this.taskId : "";
    }

    /** 
    public String getUser() {
        return (this.user != null) ? this.user : "";
    }

    /** 
    public String getName() {
        return (this.name != null) ? this.name : "";
    }

    /** 
    public ArrayList<String> getSegmentsId() {
        return this.segmentsId;
    }

    /** 
    public String getSensorUrn() {
        return (this.sensorUrn != null) ? this.sensorUrn : "";
    }

    /** 
    public void setTaskId(String _taskId) {
        this.taskId = _taskId;
    }

    /** 
    public void setUser(String _user) {
        this.user = _user;
    }

    /** 
    public void setName(String _name) {
        this.name = _name;
    }

    /** 
    public void setSegmentsId(ArrayList<String> _segmentsId) {
        this.segmentsId = _segmentsId;
    }

    /** 
    public void setSensorUrn(String _sensorUrn) {
        this.sensorUrn = _sensorUrn;
    }
}