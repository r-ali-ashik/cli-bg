package org.ni.rpg.entity;

import org.ni.rpg.composite.GameObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nazmul on 9/29/2018.
 */
public class Map extends GameObject {

    private List<GameObject> gameObjects = new ArrayList<>();

    public Map(Appearance appearance, Attribute attribute) {
        super(appearance, attribute);
    }

    public void addGameObject(GameObject gameObject){
        gameObjects.add(gameObject);
    }

    public boolean removeGameObject(GameObject gameObject){
        return gameObjects.remove(gameObject);
    }

    public Character[][] draw(Character[][] characters) {
        for(GameObject gameObject : gameObjects)
        {
            gameObject.draw(characters);
        }
        return characters;
    }

}
