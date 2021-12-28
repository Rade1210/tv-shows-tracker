package com.example.tvshowstracker.models;

import com.google.gson.annotations.SerializedName;

public class TVShow {

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;

    @SerializedName("start_date")
    private String startDate;

    @SerializedName("country")
    private String country;

    @SerializedName("network")
    private String network;

    @SerializedName("status")
    private String status;

    @SerializedName("image_thumbnail_path")
    private String thumbnail;

    public TVShow(int id, String name, String startDate, String country, String network, String status, String thumbnail) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.country = country;
        this.network = network;
        this.status = status;
        this.thumbnail = thumbnail;
    }
}
