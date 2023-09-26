package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static HashMap<String, String> events = new HashMap<>();

    @GetMapping
    public String renderEvents(Model model) {
        model.addAttribute("title", "All Events");
        model.addAttribute("events", events);
        events.put("Astronomy Festival", "Let's look at the stars!");
        events.put("Premier Designer Event", "Come check out today's new styles (and cocktails)!");
        events.put("Harvest Festival", "Korean Harvest Festival - welcome autumn with a party!");
        events.put("Glass Pumpkin Patch", "A pumpkin patch - of glass pumpkins!");
        return "events/index";
    }

    @GetMapping("create")
    public String renderCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String createEvent(@RequestParam String eventName, @RequestParam String eventDesc) {
        events.put(eventName, eventDesc);
        return "redirect:/events";
    }

}
