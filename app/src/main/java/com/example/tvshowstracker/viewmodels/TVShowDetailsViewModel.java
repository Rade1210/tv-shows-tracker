package com.example.tvshowstracker.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowstracker.repositories.TVShowDetailsRepository;
import com.example.tvshowstracker.responses.TVShowDetailsResponse;

public class TVShowDetailsViewModel extends ViewModel {

    private TVShowDetailsRepository tvShowDetailsRepository;

    public TVShowDetailsViewModel(){
        tvShowDetailsRepository = new TVShowDetailsRepository();
    }

    public LiveData<TVShowDetailsResponse> getTVShowDetails(String tvShowId){
        return tvShowDetailsRepository.getTVShowDetails(tvShowId);
    }



}
