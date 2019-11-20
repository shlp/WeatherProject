package com.example.shenliping.homeworktwo.gson;

/**
 * Created by shenliping on 2018/12/18.
 */

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}