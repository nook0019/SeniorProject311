package com.seniorfinalpro.seniorproject311.Model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Pc100 on 17/12/2559.
 */

public class ListModel implements Serializable {
    ArrayList<ItemModle> list = new ArrayList<>();

    public ArrayList<ItemModle> getList() {
        return list;
    }

    public void setList(ArrayList<ItemModle> list) {
        this.list = list;
    }
}
