package com.seniorfinalpro.seniorproject311.Model;

import java.io.Serializable;

/**
 * Created by Pc100 on 17/12/2559.
 */

public class ItemModle implements Serializable {

    MainModel main = new MainModel();
    CloudModel clouds = new CloudModel();

    public CloudModel getClouds() {
        return clouds;
    }

    public void setClouds(CloudModel clouds) {
        this.clouds = clouds;
    }



    public MainModel getMainModel() {
        return main;
    }

    public void setMainModel(MainModel main) {
        this.main = main;
    }
}
