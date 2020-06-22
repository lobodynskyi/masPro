package com.masPro.masPro.enums;

public enum ApplicationStatusEnum {
    DONE(1), INPROGRESS(2), REFUSAL(3);

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
}
