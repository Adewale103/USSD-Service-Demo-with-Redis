package com.twinkles.ussd.service.service;

import com.twinkles.ussd.service.data.UssdSession;
import com.twinkles.ussd.service.repository.UssdSessionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UssdSessionService {
    private final UssdSessionRepository ussdSessionRepository;

    public UssdSession createUssdSession(UssdSession session) {
        return ussdSessionRepository.save(session);
    }

    public UssdSession get(String id) {
        return ussdSessionRepository.findById(id).orElse(null);
    }

    public UssdSession update(UssdSession session) {
        if (ussdSessionRepository.existsById(session.getId())) {
            return ussdSessionRepository.save(session);
        }
        throw new IllegalArgumentException("A session must have an id to be updated");
    }

    public void delete(String id) {
        ussdSessionRepository.deleteById(id);
    }
}