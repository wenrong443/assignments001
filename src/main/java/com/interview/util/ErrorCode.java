package com.interview.util;

public class ErrorCode {
    public static final String ERROR_CODE = "0";
    public static final String ERROR_CODE_MSG = "ERROR";

    // user session
    public static final String PASSWORD_IS_EMPTY = "E001001";
    public static final String EMAIL_IS_EMPTY = "E001002";

    // jwt section
    public static final String JWT_TOKEN_EXPIRED = "E002001";
    public static final String JWT_USER_NOT_FOUND = "E002002";

    // product session
    public static final String INVALID_MERCHANT = "E003001";
    public static final String INVALID_CATEGORY = "E003002";
    public static final String URL_IS_EMPTY = "E003003";
    public static final String TITLE_IS_EMPTY = "E003004";
    public static final String PRICE_IS_EMPTY_OR_NEGATIVE = "E003005";
    public static final String MSRP_IS_EMPTY = "E003006";
    public static final String STATUS_IS_EMPTY = "E003007";
    public static final String INVALID_STATUS = "E003008";
    public static final String DESCRIPTION_IS_EMPTY = "E003009";
    public static final String CATEGORY_ID_IS_EMPTY = "E003010";
    public static final String MERCHANT_ID_IS_EMPTY = "E003011";
    public static final String PRODUCT_NOT_FOUND = "E003012";

    // general section
    public static final String FAILED_TO_INSERT = "E004001";
    public static final String FAILED_TO_UPDATE = "E004002";
    public static final String FAILED_TO_DELETE = "E004003";

    // product image session
    public static final String MAX_4_IMAGES_PER_PRODUCT = "E005001";

}
