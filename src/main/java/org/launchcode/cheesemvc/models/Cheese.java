
package org.launchcode.cheesemvc.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashMap;

public class Cheese {

    @NotNull
    @Size(min=3,max=15)
    private String name;

    @NotNull
    @Size(min=1, message="The description cannot be empty")
    private String description;

    private int cheeseId;
    private static  int nextId = 1;

    public Cheese(String name, String description) {
        this();
        this.name = name;
        this.description = description;
    }

    public Cheese() {
        cheeseId = nextId;
        nextId++;
    }

    // Getters
    public int getCheeseId() {
        return cheeseId;
    }

    public void setCheeseId(int cheeseId) {
        this.cheeseId = cheeseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    /*
    public String getTitle(String aTitle) {
        title = aTitle;
        return title;
    }

    public String setTitle(String sTitle) {
        title = sTitle;
    }

    public String getCheese(String aCheese){
        chesse = "";
        if (cheeses.containsKey(aCheese)) {
            chesse = aCheese;
            description = cheeses.get(chesse);
        }
        return chesse;
    }
    */

    /*
    public HashMap<String,String>(String aCheese, String aDescription){
        chesse = aCheese;
        description = aDescription;

        cheeses.put(chesse, description);

        return cheeses;
    }
    */

}
