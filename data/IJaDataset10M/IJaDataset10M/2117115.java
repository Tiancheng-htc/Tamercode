package com.astrium.faceo.client.bean.programming.sps2.request;

import java.io.Serializable;

/**
public class PointingAngleRangeBean implements Serializable {

    /**
    private static final long serialVersionUID = -5822825154274206887L;

    /** Along Track Range min (deg) */
    private float alongTrackMin = 0;

    /** Along Track Range max (deg) */
    private float alongTrackMax = 0;

    /** Across Track Range min (deg) */
    private float acrossTrackMin = 0;

    /** Across Track Range max (deg) */
    private float acrossTrackMax = 0;

    /**
    public PointingAngleRangeBean() {
    }

    /** 
    public float getAlongTrackMin() {
        return this.alongTrackMin;
    }

    /** 
    public float getAlongTrackMax() {
        return this.alongTrackMax;
    }

    /** 
    public float getAcrossTrackMin() {
        return this.acrossTrackMin;
    }

    /** 
    public float getAcrossTrackMax() {
        return this.acrossTrackMax;
    }

    /** 
    public void setAlongTrackMin(float _alongTrackMin) {
        this.alongTrackMin = _alongTrackMin;
    }

    /** 
    public void setAlongTrackMax(float _alongTrackMax) {
        this.alongTrackMax = _alongTrackMax;
    }

    /** 
    public void setAcrosTrackMin(float _acrossTrackMin) {
        this.acrossTrackMin = _acrossTrackMin;
    }

    /** 
    public void setAcrosTrackMax(float _acrossTrackMax) {
        this.acrossTrackMax = _acrossTrackMax;
    }
}