package com.twinkles.ussd.service.controller;

import com.twinkles.ussd.service.data.Menu;
import com.twinkles.ussd.service.service.MenuService;
import com.twinkles.ussd.service.service.UssdRoutingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("twinkles/com/")
@RequiredArgsConstructor
@CrossOrigin("*")
public class UssdController {
    private final MenuService menuService;

    private final UssdRoutingService ussdRoutingService;

    @GetMapping(path = "menus")
    public ResponseEntity<?> menusLoad() throws IOException {
        Map<String, Menu> response = menuService.loadMenus();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping(path = "ussd")
    public ResponseEntity<?> ussdIngress(@RequestParam String sessionId, @RequestParam String serviceCode,
                              @RequestParam String phoneNumber, @RequestParam String text) throws IOException {
        String response = ussdRoutingService.menuLevelRouter(sessionId, serviceCode, phoneNumber, text);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
