package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/10.
 */
class CloseExample {
    public static void main(String[] args) {
        def close={param->println("What the fuck $param")}
        close.call("qiang")
    }
}
