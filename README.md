# Spring default method failure example

Demonstrates how Spring 4.2.5.RELEASE is not capable of injecting into Java8 default methods via XML context files.

To run:
mvn clean test

Simple example of default method injection failure:
com.cjbooms.SomeFailedWiringTest

Example of an ugly hack that gets around the issue:
com.cjbooms.SomePassingWiringTest