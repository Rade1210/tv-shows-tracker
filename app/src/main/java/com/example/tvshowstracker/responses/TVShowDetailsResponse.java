package com.example.tvshowstracker.responses;

import com.example.tvshowstracker.models.TVShowDetails;
import com.google.gson.annotations.SerializedName;

public class TVShowDetailsResponse {

    @SerializedName("tvShow")
    private TVShowDetails tvShowDetails;

    public TVShowDetails getTvShowDetails() {
        return tvShowDetails;
    }
}
