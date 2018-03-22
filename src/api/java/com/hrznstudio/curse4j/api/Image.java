package com.hrznstudio.curse4j.api;

import java.awt.image.BufferedImage;
import java.net.URL;

public interface Image {
    URL getSource();

    BufferedImage getImage();
}
