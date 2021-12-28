package com.example.tvshowstracker.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.tvshowstracker.repositories.MostPopularTVShowsRepository;
import com.example.tvshowstracker.responses.TVShowsResponse;

public class MostPopularTVShowsViewModel extends ViewModel {

    private MostPopularTVShowsRepository mostPopularTVShowsRepository;

    public MostPopularTVShowsViewModel(){
        mostPopularTVShowsRepository = new MostPopularTVShowsRepository();
    }

    public LiveData<TVShowsResponse> getMostPopularTVShows(int page){
        return mostPopularTVShowsRepository.getMostPopularTVShows(page);
    }

}
