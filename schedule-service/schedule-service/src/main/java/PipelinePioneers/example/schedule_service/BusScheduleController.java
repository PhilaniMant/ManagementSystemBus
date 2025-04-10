package PipelinePioneers.example.schedule_service;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/schedules")
public class BusScheduleController {
    private final BusScheduleService service;

    public BusScheduleController(BusScheduleService service) {
        this.service = service;
    }

    @GetMapping
    public List<BusSchedule> getAllSchedules() {
        return service.getAllSchedules();
    }

    @PostMapping
    public BusSchedule createSchedule(@RequestBody BusSchedule schedule) {
        return service.saveSchedule(schedule);
    }

    @DeleteMapping("/{id}")
    public void deleteSchedule(@PathVariable Long id) {
        service.deleteSchedule(id);
    }
}
