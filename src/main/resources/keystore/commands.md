
# Steps to add this certificate to Spring Boot

**PKCS12**

1. Generate the key:<br>
`keytool -genkey -alias sslserver -storetype PKCS12 -keyalg RSA -keysize 2048 -keystore sslserver.p12 -validity 365`


2. Extract one single Certificate form the p12 keystore as p12 stores multiple certificate:<br>
`keytool -export -keystore sslserver.p12 -alias sslserver -file sslserver-cert.crt`