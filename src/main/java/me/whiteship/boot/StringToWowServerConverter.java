package me.whiteship.boot;

import org.springframework.core.convert.converter.Converter;

/**
 * @author Keeun Baik
 */
public class StringToWowServerConverter implements Converter<String, WowServer> {

    @Override
    public WowServer convert(String source) {
        WowServer wowServer = new WowServer();
        wowServer.setName(source);
        return wowServer;
    }

}
