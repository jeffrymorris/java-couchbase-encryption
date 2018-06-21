# Couchbase Java SDK Field Level Encryption #

This project contains the cryptographic algorithms and key store providers which are
used by the Couchbase Java SDK to provide field level encryption.


## Cryptography Support ##

The project supports the following cryptographic algorithms

* `AES-128`
* `AES-256`
* `RSA`

and the following key store providers

* `JCEKS`
* `Hashicorp Vault`

## Usage ##
Add maven dependency as
```xml
<dependency>
  <groupId>com.couchbase.client</groupId>
  <artifactId>encryption</artifactId>
  <version>${version}</version>
</dependency>
```
