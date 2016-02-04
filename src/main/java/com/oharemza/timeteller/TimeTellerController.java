package com.oharemza.timeteller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Clock;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


@RestController
public class TimeTellerController {

    private Clock clock;

    public TimeTellerController() {
        this.clock = Clock.systemUTC();
    }

    public TimeTellerController(Clock clock) {
        this.clock = clock;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String tell() {
        return DateTimeFormatter.ISO_INSTANT.format(ZonedDateTime.now(clock));
    }

}
