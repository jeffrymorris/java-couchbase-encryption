/*
 * Copyright (c) 2018 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.couchbase.client.crypto;

/**
 * Enum for selecting the crypto provider by name
 *
 * @author Subhashni Balakrishnan
 * @since 0.1.0
 */
public enum CRYPTO_PROVIDER {
    /**
     * AES encryption provider using 128 bit key
     */
    AES128 {
        @Override
        public String toString() {
            return AES128CryptoProvider.NAME;
        }
    },

    /**
     * AES encryption provider using 256 bit key
     */
    AES256 {
        @Override
        public String toString() {
            return AES256CryptoProvider.NAME;
        }
    },

	/**
     * RSA encryption provider
     */
    RSA {
        @Override
        public String toString() {
            return RSACryptoProvider.NAME;
        }
    }

}
