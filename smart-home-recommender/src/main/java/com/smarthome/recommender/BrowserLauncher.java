package com.smarthome.recommender;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BrowserLauncher {

    @Value("${server.port:8080}")
    private int port;

    @PostConstruct
    public void openBrowser() {
        String url = "http://localhost:" + port + "/";
        try {
            String os = System.getProperty("os.name").toLowerCase();
            if (os.contains("win")) {
                new ProcessBuilder("cmd", "/c", "start", "chrome", url).start();
            } else if (os.contains("mac")) {
                new ProcessBuilder("open", "-a", "Google Chrome", url).start();
            } else {
                new ProcessBuilder("xdg-open", url).start();  // Linux
            }
        } catch (Exception e) {
            // ignore if browser can't be started
        }
    }
}