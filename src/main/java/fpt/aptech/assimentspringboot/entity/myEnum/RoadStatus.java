package fpt.aptech.assimentspringboot.entity.myEnum;

public enum RoadStatus {
    USING(1),
    UNDER_CONSTRUCTION(2),
    REPAIRING(3),
    UNDEFINED(99);

    private int value;

    RoadStatus(int value) {this.value = value;}

    public int getValue() {
        return this.value;
    }

    public static RoadStatus of(int value) {
        for(RoadStatus roadStatus : RoadStatus.values()) {
            if(roadStatus.getValue() == value) return roadStatus;
        }
        return RoadStatus.UNDEFINED;
    }
}