package com.xyh;

import java.util.List;

public class JsonRootBean {
    private String config_str;
    private List<Plates> plates;
    private boolean success;
    private String request_id;
    public void setConfig_str(String config_str) {
        this.config_str = config_str;
    }
    public String getConfig_str() {
        return config_str;
    }

    public void setPlates(List<Plates> plates) {
        this.plates = plates;
    }
    public List<Plates> getPlates() {
        return plates;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
    public boolean getSuccess() {
        return success;
    }

    public void setRequest_id(String request_id) {
        this.request_id = request_id;
    }
    public String getRequest_id() {
        return request_id;
    }
}
