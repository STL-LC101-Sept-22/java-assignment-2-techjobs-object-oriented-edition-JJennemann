package org.launchcode.techjobs.oo;

import javax.swing.text.Position;
import java.util.Objects;

public class PositionType extends JobField {

    public PositionType(String value){
        super(value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PositionType)) return false;
        PositionType positionType = (PositionType) o;
        return getId() == positionType.getId();
    }
//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public PositionType() {
//        id = nextId;
//        nextId++;
//    }
//
//    public PositionType(String value) {
//        this();
//        this.value = value;
//    }
//
//    // TODO: Add a custom toString() method that returns the data stored in 'value'.
//
//    @Override
//    public String toString() {
//        if(value == null || value == ""){
//            return "Data not available";
//        }
//        return value;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if(this == o) return true;
//        if(!(o instanceof PositionType)) return false;
//        PositionType positionType = (PositionType) o;
//        return getId() == positionType.getId();
//
////        if(o == this){
////            return true;
////        }
////        if (o == null){
////            return false;
////        }
////        if(o.getClass() != getClass()){
////            return false;
////        }
////        PositionType positionType = (PositionType) o;
////        return positionType.getId() == getId();
//    }
//
//    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
//    //  their id fields match.
//
//    // Getters and Setters:
//
//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

}
