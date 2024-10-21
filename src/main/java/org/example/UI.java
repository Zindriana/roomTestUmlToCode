package org.example;

import java.util.List;
import java.util.ArrayList;

public class UI {

    public UI(){

    }

    public void interactWithObject(int index){

        String objectToFind = null;
        switch(index){
            case 1:
                objectToFind = "Shelf";
                break;
            case 2:
                objectToFind = "Table";
                break;
            case 3:
                objectToFind = "Chair";
                break;
            default:
                break;
        }

        //library.getRoomObject(objectToFind).interactWithObject();

    }

}
