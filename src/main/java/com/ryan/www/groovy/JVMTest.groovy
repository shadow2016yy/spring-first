package com.ryan.www.groovy
import  java.lang.management.*
/**
 * Created by Ryan on 2018/11/10.
 */
class JVMTest {
    public static void main(String[] args) {

        def os = ManagementFactory.operatingSystemMXBean
        println(os.arch)
        println(os.name)
        def bean = ManagementFactory.memoryMXBean
        def usage = bean.heapMemoryUsage
        println(usage.init)
        println(usage.committed)

    }
}
