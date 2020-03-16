package com.interview.util;

public abstract class TypeSelection {
    // USER ROLES SECTION
    public static final int USER_ROLE_USER = 0;
    public static final int USER_ROLE_SUPER_ADMIN = 1;

    public static  final String[] USER_ROLE = {"USER", "SUPER_ADMIN"};
    public static final String[] USER_ROLE_DESC = {"ALLOW USER ACCESS", "ALLOW SUPER_ADMIN ACCESS"};

    // VERIFICATION CODE SECTION
    public static final String VERIFICATION_NEW_REGISTER_ORI = "NEW_REGISTRATION";
    public static final String VERIFICATION_NEW_FORGOT_PASSWORD_ORI  = "FORGOT_PASSWORD";

    public static final String CATEGORY_OTHER = "OTHER";

    // TYPE FOR REVIEW & RATING
    public static final String REVIEW_RATING_TYPE_PRODUCT = "PRODUCT";
    public static final String REVIEW_RATING_TYPE_PERSON = "PERSON";
    // STATUS FOR REVIEW & RATING
    public static final int REVIEW_RATING_STATUS_AVAILABLE = 1;
    public static final int REVIEW_RATING_STATUS_REMOVED= 2;

    // STATUS FOR ORDER
    public static final int ORDER_TYPE_PENDING = 1;
    public static final int ORDER_TYPE_SELLER_CONFIRM_ORDER = 2;
    public static final int ORDER_TYPE_SELLER_MARK_TRADE_AS_COMPLETE = 3;
    public static final int ORDER_TYPE_SELLER_MARK_TRADE_AS_INCOMPLETE = 4;

    // STATUS FOR PRODUCT
    public static final int PRODUCT_STATUS_AVAILABLE = 1;
    public static final int PRODUCT_STATUS_OUT_OF_STOCK = 2;
    public static final int PRODUCT_STATUS_PRE_ORDER = 3;
    public static final int PRODUCT_STATUS_INACTIVE = 4;

    // MIDDLE PATH FOR IMAGE
    public static final String ACCESS_IMAGE_URL = "/image/";
    public static final String MIDDLE_PATH_PRODUCT = "product";
    public static final String MIDDLE_PATH_ANIMAL_CATEGORY = "animalcategory";
    public static final String MIDDLE_PATH_ANNOUNCEMENT = "announcement";
    public static final String MIDDLE_PATH_BOOST_OPTION = "boostoption";
    public static final String MIDDLE_PATH_CATEGORY = "category";
    public static final String MIDDLE_PATH_COIN_OPTION = "coinoption";
    public static final String MIDDLE_PATH_MOMENTS = "moments";
    public static final String MIDDLE_PATH_REVIEW_RATING = "reviewrating";
    public static final String MIDDLE_PATH_USER = "user";
    public static final String MIDDLE_PATH_USER_COMPANY = "usercompany";
    public static final String MIDDLE_PATH_REPORT = "report";

    // STATUS FOR PRODUCT IMAGE
    public static final int PRODUCT_IMAGE_STATUS_AVAILABLE = 1;
    public static final int PRODUCT_IMAGE_STATUS_REMOVED= 2;

    // STATUS FOR VARIATION
    public static final int VARIATION_STATUS_AVAILABLE = 1;
    public static final int VARIATION_STATUS_REMOVED= 2;

    // TYPE FOR FAVORITE
    public static final int FAVORITE_TYPE_FAVORITE = 1;
    public static final int FAVORITE_TYPE_UNFAVORITE = 2;

    // TYPE FOR REPORT
    public static final int REPORT_TYPE_PRODUCT_SERVICES = 1;
    public static final int REPORT_TYPE_USER = 2;
    public static final int REPORT_TYPE_BUGS = 3;
    public static final int REPORT_TYPE_SUGGESTION = 4;
    public static final int REPORT_TYPE_OTHER = 5;

    // TYPE FOR AsyncCalculateViewNClick
    public static final int ASYNC_CALCULATE_TYPE_SHOW_ON_PRODUCT_LISTING = 1;
    public static final int ASYNC_CALCULATE_TYPE_CLICK_TO_SHOW_PRODUCT_DETAILS = 2;
    public static final int ASYNC_CALCULATE_TYPE_CLICK_TO_SHOW_SELLER_PROFILE_N_PRODUCTS = 3;

    // TYPE FOR FOLLOW
    public static final int FOLLOW_TYPE_FOLLOW = 1;
    public static final int FOLLOW_TYPE_UNFOLLOW = 2;

    // TYPE FOR AsyncNotifyUser
    public static final int ASYNC_NOTIFY_TYPE_NEW_PRODUCT_RELEASE = 1; // type | ptId | product owner's ID
    public static final int ASYNC_NOTIFY_TYPE_BUYER_MAKE_ORDER = 2;
    public static final int ASYNC_NOTIFY_TYPE_SELLER_CONFIRM_ORDER = 3;
    public static final int ASYNC_NOTIFY_TYPE_SELLER_REJECT_ORDER = 4;
    public static final int ASYNC_NOTIFY_TYPE_ADMIN_ANNOUNCEMENT = 5;
    public static final int ASYNC_NOTIFY_TYPE_WALLET_LOW_BALANCE_N_STOP_ADVERTISE = 6; // type | utId

    // TYPE FOR USER
    public static final int USER_TYPE_USER = 1;
    public static final int USER_TYPE_SELLER = 2;
    public static final int USER_TYPE_ADMIN = 3;

    // TYPE FOR ANNOUNCEMENT NOTIFY
    public static final int ANNOUNCEMENT_NOTIFY_TYPE_TARGET_NO = 0;
    public static final int ANNOUNCEMENT_NOTIFY_TYPE_TARGET_ALL = 1;
    public static final int ANNOUNCEMENT_NOTIFY_TYPE_TARGET_USER = 2;
    public static final int ANNOUNCEMENT_NOTIFY_TYPE_TARGET_SELLER = 3;

    // TYPE FOR ANNOUNCEMENT
    public static final String ANNOUNCEMENT_TYPE_LINK = "LINK";
    public static final String ANNOUNCEMENT_TYPE_NEW_PAGE = "NEW_PAGE";

    // TYPE FOR BOOST
    public static final int BOOST_TYPE_ADVERTISE_SHOP_LISTING = 1;
    public static final int BOOST_TYPE_ADVERTISE_PRODUCT_LISTING = 2;
    public static final int BOOST_TYPE_ADVERTISE_WEBSITE_LISTING = 3;
    public static final int BOOST_TYPE_ADVERTISE_PRODUCT_DASHBOARD = 4;

    // TYPE FOR BOOST LIMIT
    public static final int BOOST_LIMIT_TYPE_NO_LIMIT = 1;
    public static final int BOOST_LIMIT_TYPE_HAVE_LIMIT = 2;
    public static final int BOOST_LIMIT_TYPE_UNTIL_WHEN = 3;

    // TYPE FOR FREE COIN
    public static final int FREE_COIN_INVITE_FRIEND = 1;


}
