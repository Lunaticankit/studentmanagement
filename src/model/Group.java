package model;

import java.util.ArrayList;

public class Group {
    String name;
    ArrayList<Teams>teamsArrayList;

    public Group(String name, ArrayList<Teams> teamsArrayList) {
        this.name = name;
        this.teamsArrayList = teamsArrayList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Teams> getTeamsArrayList() {
        return teamsArrayList;
    }

    public void setTeamsArrayList(ArrayList<Teams> teamsArrayList) {
        this.teamsArrayList = teamsArrayList;
    }
}
