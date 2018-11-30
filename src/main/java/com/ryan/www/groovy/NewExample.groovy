package com.ryan.www.groovy

/**
 * Created by Ryan on 2018/11/10.
 */
class NewExample {
    public static void main(String[] args) {
        Integer x=5,y=10,z=0;
        z=x+y;
        println(z)
        String S="HELLO WORLD"
        println(S[1])
        println(S[-1])
        println(S[0..3])
        def list=1..3
        println(list.getClass())
        println(list.from)
        println(list.to)
        println(list.size())
        println(list.sum())
        def date=new Date()
        def time = date.getTime()
        println(time)
        println(time.getClass())
        println("-----------------------------")
        def account = new Account()
        account.name="icbc"
        println(account.name)
    }
}
