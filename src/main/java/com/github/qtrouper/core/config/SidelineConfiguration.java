package com.github.qtrouper.core.config;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

/**
 * @author koushik
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Builder
public class SidelineConfiguration {

    @Builder.Default
    private boolean enabled = true;

    private int concurrency;

}
