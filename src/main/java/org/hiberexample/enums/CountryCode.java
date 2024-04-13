package org.hiberexample.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum CountryCode {
    RUS("Russia"),

    US("Unated States of Amerika"),

    BL("Belarus"),

    KZ("Kazakhstan");

    private final String value;
}
