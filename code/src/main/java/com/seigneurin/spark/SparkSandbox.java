package com.seigneurin.spark;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.spark.api.java.JavaSparkContext;

public class SparkSandbox {

    public static void main(String[] args) throws UnknownHostException {

        String appName = "sandbox-" + InetAddress.getLocalHost().getHostName();
        JavaSparkContext sc = new JavaSparkContext("local", appName);

        long res = sc.textFile("../data/paris-arbresalignementparis2010/arbresalignementparis2010.csv")
                .count();
        System.out.println(res);

        sc.close();
    }

}
