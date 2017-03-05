package com.company;

/**
 * Created by mavl on 17.01.2017.
 */
public class Component {
    final static int MAX_COMPONENTS = 5;
    final static int NONE = 0;
    final static int WATER = 1;
    final static int PLANT = 2;
    final static int MEADOW = 3;
    final static int LANDSCAPE = 4;

    private int pollution;
    private int condition;
    int type;

    Component () {}

    Component (int type) {
        this.type = type;
    }

    public int[] getDefaultSize() { return null; }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public void setPollution(int Pollution) {
        this.pollution = Pollution;
    }

}

class Water extends Component {

    final static int MAX_TYPES = 3;
    final static int POND = 1;
    final static int LAKE = 2;
    final static int RIVER = 3;

    Water () {}

    Water (int type) {
        super(type);
    }

    static Water randWater() {
        return new Water((int)((Math.random())*MAX_TYPES));
    }

    @Override
    public int[] getDefaultSize() {
        int[] size = new int[2];
        switch (this.type) {
            case POND:
                size[0] = 1;
                size[1] = 1;
                break;

            case LAKE:
                size[0] = 2;
                size[1] = 2;
                break;

            case RIVER:
                size[0] = 1;
                size[1] = 10;
                break;
        }
        return size;
    }
}

class Plant extends Component{
    final static int MAX_TYPES = 4;
    final static int SHRUB = 1;
    final static int TREE = 2;
    final static int SMALL_FOREST = 3;
    final static int FOREST = 4;


    Plant () {}

    Plant (int type) {
        super(type);
    }

    static Plant randPlant() {
        return new Plant((int)((Math.random())*MAX_TYPES));
    }

    @Override
    public int[] getDefaultSize() {
        int[] size = new int[2];
        switch (this.type) {
            case SHRUB:
                size[0] = 1;
                size[1] = 1;
                break;

            case TREE:
                size[0] = 1;
                size[1] = 1;
                break;

            case SMALL_FOREST:
                size[0] = 3;
                size[1] = 3;
                break;

            case FOREST:
                size[0] = 4;
                size[1] = 4;
                break;
        }
        return size;
    }
}

class Meadow extends Component {
    final static int MAX_TYPES = 4;
    final static int SMALL = 1;
    final static int MEDIUM = 2;
    final static int LARGE = 3;
    final static int HUGE = 4;

    Meadow () {}

    Meadow (int type) {
        super(type);
    }

    static Meadow randMeadow() {
        return new Meadow((int)((Math.random())*MAX_TYPES));
    }

    @Override
    public int[] getDefaultSize() {
        int[] size = new int[2];
        switch (this.type) {
            case SMALL:
                size[0] = 1;
                size[1] = 1;
                break;

            case MEDIUM:
                size[0] = 2;
                size[1] = 2;
                break;

            case LARGE:
                size[0] = 3;
                size[1] = 3;
                break;

            case HUGE:
                size[0] = 4;
                size[1] = 4;
                break;
        }
        return size;
    }
}

class Landscape extends Component {
    final static int MAX_TYPES = 3;
    final static int HILL = 1;
    final static int MOUNTAIN = 2;
    final static int CANYON = 4;

    public boolean hasCave;

    Landscape() {}

    Landscape (int type) { super (type); }

    public void setHasCave(boolean hasCave) {
        this.hasCave = hasCave;
    }

    static Landscape randLandscape() {
        return new Landscape((int)((Math.random())*MAX_TYPES));
    }

    @Override
    public int[] getDefaultSize() {
        int[] size = new int[2];
        switch (this.type) {
            case HILL:
                size[0] = 1;
                size[1] = 1;
                break;

            case MOUNTAIN:
                size[0] = 3;
                size[1] = 3;
                break;

            case CANYON:
                size[0] = 6;
                size[1] = 6;
                break;
        }
        return size;
    }

}
