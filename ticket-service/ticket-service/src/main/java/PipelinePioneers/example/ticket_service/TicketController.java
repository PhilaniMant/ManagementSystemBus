package PipelinePioneers.example.ticket_service;


import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @PostMapping("/book")
    public Ticket bookTicket(@RequestBody Ticket ticket) {
        return service.bookTicket(ticket);
    }

    @GetMapping
    public List<Ticket> getTickets(@RequestParam String routeName, @RequestParam String travelDateTime) {
        return service.getTicketsByRouteAndDate(routeName, LocalDateTime.parse(travelDateTime));
    }

    @PutMapping("/cancel/{id}")
    public void cancelTicket(@PathVariable Long id) {
        service.cancelTicket(id);
    }
}
