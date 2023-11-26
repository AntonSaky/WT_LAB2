package com.example.demo1.controller;

import java.util.HashMap;
import java.util.Map;

/**
 * Class containing constants for request parameter names.
 * Used to retrieve command and page names from HTTP requests.
 */
public class RequestPage {
    /** Hash that joins url pattern and jsp page */
    public Map<String, String> pages = new HashMap<>();
    public RequestPage() {
        pages.put("/site", "main.jsp");
        pages.put("/site/basket", "JSP/basket.jsp");
        pages.put("/site/single-category", "JSP/single-category.jsp");
        pages.put("/site/login", "JSP/login.jsp");

    }
    public String getPatternByURI(String uri){
        return "j";
    }

    /** Constant representing the command parameter name in HTTP requests. */
    public static final String COMMAND_NAME = "command";

    /** Constant representing the page name parameter in HTTP requests. */
    public static final String PAGE_NAME = "page_name";
}
