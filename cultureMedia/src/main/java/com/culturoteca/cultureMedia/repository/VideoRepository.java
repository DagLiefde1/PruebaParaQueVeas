package com.culturoteca.cultureMedia.repository;

import com.culturoteca.cultureMedia.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
