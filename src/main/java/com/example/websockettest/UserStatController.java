package com.example.websockettest;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class UserStatController {

    @MessageMapping("/clicked")
    @SendTo("/topic/dashboard")
    public DashboardStatData onClick(DashboardStatData dashboardStatData) {
        return new DashboardStatData(true, false);
    }

    @MessageMapping("/ordered")
    @SendTo("/topic/dashboard")
    public DashboardStatData onOrder(DashboardStatData dashboardStatData) {
        return new DashboardStatData(false, true);
    }
}
