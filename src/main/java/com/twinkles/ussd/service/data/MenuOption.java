package com.twinkles.ussd.service.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.twinkles.ussd.service.data.enums.MenuOptionAction;
import lombok.Data;

@Data
public class MenuOption {

    private String type;
    private String response;

    @JsonProperty("next_menu_level")
    private String nextMenuLevel;

    private MenuOptionAction action;
}