package com.example.ttu;

import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = {"tidtagarur"}, produces = {"application/json"})
@CrossOrigin
public class controller {

    private final dataService dataService;

    public controller(dataService dataService) {
        this.dataService = dataService;
    }
    @CrossOrigin
    @PostMapping({"/tider"})
    public void saveTime(@RequestHeader("millisekunder") String millisek, @RequestHeader("sekunder") String sek, @RequestHeader("minuter") String min, @RequestHeader("timmar") String tim) {
        this.dataService.saveTime(millisek, sek, min, tim);
    }

    @GetMapping
    public List<ttu> getTime() {
        return this.dataService.getTime();
    }
}
