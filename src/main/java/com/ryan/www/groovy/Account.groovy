package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/10.
 */
class Account implements GroovyInterceptable {
    protected dynamicProps=[:]
    void setProperty(String pName,val) {
        dynamicProps[pName] = val
    }

    def getProperty(String pName) {
        dynamicProps[pName]
    }
}
