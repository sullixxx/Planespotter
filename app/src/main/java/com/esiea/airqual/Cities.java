package com.esiea.airqual;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Cities {

    @SerializedName("status")
    @Expose
    private String status;

    @SerializedName("data")
    @Expose
    private List<String> listCities = null;

    public List<String> getListStates() {
        return listCities;
    }

    public String getStatus() {
        return status;
    }
}
