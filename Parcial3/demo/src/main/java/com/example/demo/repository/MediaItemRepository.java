package com.example.demo.repository;

import com.example.demo.entity.MediaItem; // Update import to match new package

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediaItemRepository extends JpaRepository<MediaItem, Long> {
    // Additional methods for specific queries can be declared here
}
