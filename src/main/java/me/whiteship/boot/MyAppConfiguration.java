package me.whiteship.boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

/**
 * @author Keeun Baik
 */
@Component
@ConfigurationProperties("wow")
public class MyAppConfiguration {

    @NotNull
    private String battleTag;

    public String getBattleTag() {
        return battleTag;
    }

    public void setBattleTag(String battleTag) {
        this.battleTag = battleTag;
    }
}
