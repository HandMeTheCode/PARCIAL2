package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.MediaItem;
import com.example.demo.service.MediaItemService;

import java.util.List;

@RestController
@RequestMapping("/mediaItems")
public class MediaItemController {

    private final MediaItemService mediaItemService;

    @Autowired
    public MediaItemController(MediaItemService mediaItemService) {
        this.mediaItemService = mediaItemService;
    }

    @GetMapping
    public List<MediaItem> getAllMediaItems() {
        return mediaItemService.getAllMediaItems();
    }

    @GetMapping("/{id}")
    public MediaItem getMediaItemById(@PathVariable Long id) {
        return mediaItemService.getMediaItemById(id);
    }

    @PostMapping
    public MediaItem saveMediaItem(@RequestBody MediaItem mediaItem) {
        return mediaItemService.saveMediaItem(mediaItem);
    }

    @DeleteMapping("/{id}")
    public void deleteMediaItem(@PathVariable Long id) {
        mediaItemService.deleteMediaItem(id);
    }
    
    // Additional endpoints for specific functionality can be added here
}
