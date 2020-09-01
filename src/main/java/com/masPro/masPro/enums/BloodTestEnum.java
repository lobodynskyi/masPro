package com.masPro.masPro.enums;

import java.util.ArrayList;

public enum BloodTestEnum {
    GENERAL(1), BIOCHEMICAL(2), HORMONAL(3);

    private Integer value;

    BloodTestEnum(Integer status) {
        this.value = status;
    }

    public Integer getStatus() {
        return value;
    }

    public static BloodTestEnum getByNumericStatus(int status) {
        for (BloodTestEnum bloodTestEnum : BloodTestEnum.values()) {
            if (bloodTestEnum.getStatus() == status) {
                return bloodTestEnum;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }

    public static String[] getStringArray(){
        ArrayList<String> enumList = new ArrayList<>();
        for (BloodTestEnum bloodTestEnum : BloodTestEnum.values()) {
            enumList.add(bloodTestEnum.name()) ;
        }
        return enumList.toArray(new String[enumList.size()]);
    }
}


