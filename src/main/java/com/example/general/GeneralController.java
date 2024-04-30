package com.example.general;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

@RestController
public class GeneralController {
    private final GeneralService generalService;

    public GeneralController(GeneralService generalService) { this.generalService = generalService;}
    @GetMapping("/generals")
    public List<General> findByGenerals(@RequestParam("startsWith") String startsWith) {
        return generalService.findGeneralsStartingWith(startsWith);
    }

    @GetMapping("/generals/{id}")
    public General findGeneral(@PathVariable("id") int id) { return generalService.findGeneral(id);}

    @ExceptionHandler(GeneralNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleGeneralNotFoundException(
        GeneralNotFoundException e, HttpServletRequest request) {
             Map<String, String> body = Map.of(
                "timestamp", ZonedDateTime.now().toString(),
                "status", String.valueOf(HttpStatus.NOT_FOUND.value()),
                "error", HttpStatus.NOT_FOUND.getReasonPhrase(),
                "message", e.getMessage(),
                "path", request.getRequestURI());
             return new ResponseEntity(body, HttpStatus.NOT_FOUND);
    }

}
