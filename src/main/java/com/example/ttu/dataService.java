package com.example.ttu;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;
@Service
public class dataService {
    private final dataRepository dataRepository;


    public dataService(dataRepository dataRepository) {
        this.dataRepository = dataRepository;
    }

    public void saveTime(String timmar, String min, String sec, String millisec) {
        ttu newTtu = new ttu(UUID.randomUUID().toString(), timmar, min, sec, millisec);
        this.dataRepository.save(newTtu);
    }

    public List<ttu> getTime() {
        return this.dataRepository.findAll();
    }
}


