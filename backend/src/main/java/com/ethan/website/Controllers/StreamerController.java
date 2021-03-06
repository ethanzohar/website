package com.ethan.website.Controllers;

import com.ethan.website.DTO.Streamer;
import com.ethan.website.repositories.SpotifyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/spotify/streamer")
public class StreamerController {

    @Autowired
    private SpotifyRepo spotifyRepo;

    @PostMapping(path = "/new", consumes = "application/json", produces = "application/json")
    public void newStreamer(@RequestBody Streamer streamer) {
        streamer.setTimestamp(System.currentTimeMillis());
        spotifyRepo.save(streamer);
    }
}