package com.ryan.www.groovy

import groovy.sql.Sql

/**
 * Created by Ryan on 2018/11/10.
 */
class DBTest {
    static void main(String[] args) {
        def db_url = "jdbc:mysql://localhost:3306/test"
        def username = "root"
        def password = "root"
        def driverClass = "com.mysql.jdbc.Driver"
        def sql = Sql.newInstance(db_url, username, password, driverClass)
        sql.eachRow(" select * from td_hdk_region "){
            row-> println(row)
        }


    }
}