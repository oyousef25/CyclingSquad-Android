package com.example.cyclingclub.pojo;

/**
 * A Pojo Class to create a new NewsItem object
 * @author Omar Yousef
 * @version 1.0
 */
public class NewsItem {
    private int image;
    private String title;

    /**
     * NewsItem Constructor
     * @param image
     * @param title
     */
    public NewsItem(int image, String title) {
        this.image = image;
        this.title = title;
    }

    /**
     * image Getter
     * @return image
     */
    public int getImage() {
        return image;
    }

    /**
     * Image Setter
     * @param image
     */
    public void setImage(int image) {
        this.image = image;
    }

    /**
     * Title Getter
     * @return title
     */
    public String getTitle() {
        return title;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
