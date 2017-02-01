package com.company;

/**
 * Created by mavl on 17.01.2017.
 */
public class Component {
    final static byte MAX_COMPONENTS = 5;
    final static byte NONE = 0;
    final static byte WATER = 1;
    final static byte PLANT = 2;
    final static byte MEADOW = 3;
    final static byte LANDSCAPE = 4;

    byte pollution;
    byte condition;
    byte type;

    Component () {}

    Component (byte type) {
        this.type = type;
    }

    public byte[] getDefaultSize() { return null; }

    public void setCondition(byte condition) {
        this.condition = condition;
    }

    public void setPollution(byte Pollution) {
        this.pollution = Pollution;
    }

}

class Water extends Component {

    final static byte MAX_TYPES = 3;
    final static byte POND = 1;
    final static byte LAKE = 2;
    final static byte RIVER = 3;

    Water () {}

    Water (byte type) {
        super(type);
    }

    static Water randWater() {
        return new Water((byte)((Math.random())*MAX_TYPES));
    }

    @Override
    public byte[] getDefaultSize() {
        byte[] size = new byte[2];
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
    final static byte MAX_TYPES = 4;
    final static byte SHRUB = 1;
    final static byte TREE = 2;
    final static byte SMALL_FOREST = 3;
    final static byte FOREST = 4;


    Plant () {}

    Plant (byte type) {
        super(type);
    }

    static Plant randPlant() {
        return new Plant((byte)((Math.random())*MAX_TYPES));
    }

    @Override
    public byte[] getDefaultSize() {
        byte[] size = new byte[2];
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
    final static byte MAX_TYPES = 4;
    final static byte SMALL = 1;
    final static byte MEDIUM = 2;
    final static byte LARGE = 3;
    final static byte HUGE = 4;

    Meadow () {}

    Meadow (byte type) {
        super(type);
    }

    static Meadow randMeadow() {
        return new Meadow((byte)((Math.random())*MAX_TYPES));
    }

    @Override
    public byte[] getDefaultSize() {
        byte[] size = new byte[2];
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
    final static byte MAX_TYPES = 3;
    final static byte HILL = 1;
    final static byte MOUNTAIN = 2;
    final static byte CANYON = 4;

    public boolean hasCave;

    Landscape() {}

    Landscape (byte type) { super (type); }

    public void setHasCave(boolean hasCave) {
        this.hasCave = hasCave;
    }

    static Landscape randLandscape() {
        return new Landscape((byte)((Math.random())*MAX_TYPES));
    }

    @Override
    public byte[] getDefaultSize() {
        byte[] size = new byte[2];
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
