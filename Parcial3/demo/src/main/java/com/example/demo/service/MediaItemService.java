package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.repository.MediaItemRepository; // Import your repository
import com.example.demo.entity.MediaItem; // Import your entity

import java.util.List;

@Service
public class MediaItemService {

    private final MediaItemRepository mediaItemRepository;

    @Autowired
    public MediaItemService(MediaItemRepository mediaItemRepository) {
        this.mediaItemRepository = mediaItemRepository;
    }

    public List<MediaItem> getAllMediaItems() {
        return mediaItemRepository.findAll();
    }

    public MediaItem getMediaItemById(Long id) {
        return mediaItemRepository.findById(id).orElse(null);
    }

    public MediaItem saveMediaItem(MediaItem mediaItem) {
        return mediaItemRepository.save(mediaItem);
    }

    public void deleteMediaItem(Long id) {
        mediaItemRepository.deleteById(id);
    }
    
    // Additional business logic methods can be added here based on requirements
}