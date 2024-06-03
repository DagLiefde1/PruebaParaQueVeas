package com.culturoteca.cultureMedia.service.impl;

import com.culturoteca.cultureMedia.model.Video;
import com.culturoteca.cultureMedia.repository.VideoRepository;
import com.culturoteca.cultureMedia.service.CulturemediaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CulturemediaServiceImpl implements CulturemediaService {

    private final VideoRepository videoRepository;

    public CulturemediaServiceImpl(VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    @Override
    public List<Video> findAllVideos() {
        return List.of();
    }

    @Override
    public Video save(Video video) {
        return null;
    }
}
