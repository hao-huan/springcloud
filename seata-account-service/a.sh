#!/bin/bash
java -jar -Ddruid.filters=mergeStat -Ddruid.useGlobalDataSource=true  -Xmx256M -Xms256M ./target/seata-account-service-0.0.1-SNAPSHOT.jar 
