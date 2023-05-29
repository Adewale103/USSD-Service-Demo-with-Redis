package com.twinkles.ussd.service.data;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Menu {
    @JsonProperty("id")
    private String id;

    @JsonProperty("menu_level")
    private String menuLevel;

    @JsonProperty("text")
    private String text;

    @JsonProperty("menu_options")
    private List<MenuOption> menuOptions;

    @JsonProperty("max_selections")
    private Integer maxSelections;
}