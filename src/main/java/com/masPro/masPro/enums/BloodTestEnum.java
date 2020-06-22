package com.masPro.masPro.enums;

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
}


