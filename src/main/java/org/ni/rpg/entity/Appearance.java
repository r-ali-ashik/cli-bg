package org.ni.rpg.entity;

/**
 * Created by nazmul on 9/29/2018.
 */
public class Appearance {
    private int positionX;
    private int positionY;
    private int height;
    private int width;
    private char[][] content;
    private String color;
    private boolean visible;

    public Appearance(int positionX, int positionY, int height, int width, char[][] content, String color, boolean visible) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.height = height;
        this.width = width;
        this.content = content;
        this.color = color;
        this.visible = visible;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public char[][] getContent() {
        return content;
    }

    public void setContent(char[][] content) {
        this.content = content;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}