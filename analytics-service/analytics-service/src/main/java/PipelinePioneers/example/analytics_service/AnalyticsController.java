// filepath: ManagementSystemBus/analytics-service/src/main/java/PipelinePioneers/example/analytics_service/AnalyticsController.java
package PipelinePioneers.example.analytics_service;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @GetMapping("/summary")
    public String getAnalyticsSummary() {
        // Simulate analytics summary
        return "Analytics summary data";
    }
}
