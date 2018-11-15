API Test Example
================

This project was used during the hands-on of my presentation on API tests with Rest Assured.

It is a simple test project with Rest Assured configured.

## Wiremock server
To run the tests first you need clone the wiremock server project and run it: https://github.com/massahud/api-test-example-wiremock

## Running
The project have an embedded gradle wrapper script, so you do not need to have gradle installed, 
only Java.

```bash
./gradlew test
```
If windows (not tested): 
```sh
./gradlew.bat test
```
