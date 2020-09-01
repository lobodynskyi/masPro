package com.masPro.masPro.enums;

import java.util.ArrayList;

public enum ApplicationStatusEnum {
    DONE(1), IN_PROGRESS(2), REFUSAL(3);

    private Integer value;

    ApplicationStatusEnum(Integer status) {
        this.value = status;
    }

    public Integer getStatus() {
        return value;
    }

    public static ApplicationStatusEnum getByNumericStatus(int status) {
        for (ApplicationStatusEnum accountStatus : ApplicationStatusEnum.values()) {
            if (accountStatus.getStatus() == status) {
                return accountStatus;
            }
        }
        return null;
    }

    public Integer getValue() {
        return value;
    }

    public static String[] getStringArray(){
        ArrayList<String> enumList = new ArrayList<>();
        for (ApplicationStatusEnum applicationStatusEnum : ApplicationStatusEnum.values()) {
            enumList.add(applicationStatusEnum.name()) ;
        }
        return enumList.toArray(new String[enumList.size()]);
    }
}
