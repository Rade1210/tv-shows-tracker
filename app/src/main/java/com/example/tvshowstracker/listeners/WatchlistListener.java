package com.example.tvshowstracker.listeners;

import com.example.tvshowstracker.models.TVShow;

public interface WatchlistListener {

    void onTVShowClicked(TVShow tvShow);

    void removeTVShowFromWatchlist(TVShow tvShow, int position);


}
