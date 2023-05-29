package com.twinkles.ussd.service.repository;

import com.twinkles.ussd.service.data.UssdSession;
import org.springframework.data.repository.CrudRepository;

public interface UssdSessionRepository extends CrudRepository<UssdSession, String> {
}
