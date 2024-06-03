package com.culturoteca.cultureMedia.service;

import com.culturoteca.cultureMedia.model.Video;

import java.util.List;

public interface CulturemediaService {
    List <Video> findAllVideos();
    Video save(Video video);
}
