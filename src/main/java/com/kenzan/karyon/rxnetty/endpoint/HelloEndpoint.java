/**
 * Copyright 2015 Kenzan, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.kenzan.karyon.rxnetty.endpoint;

import io.netty.buffer.ByteBuf;
import io.reactivex.netty.protocol.http.server.HttpServerRequest;

import java.util.regex.Pattern;

import com.sun.jersey.api.uri.UriPattern;

import rx.Observable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloEndpoint {
    private static final Logger logger = LoggerFactory.getLogger(Quickstart.class);
    
    public Observable<String> getHello() {
        return Observable.just("Hello");
    }

    public Observable<String> getHelloName(HttpServerRequest<ByteBuf> request) {
        UriPattern pattern = new UriPattern(Pattern.compile("/hello/(.*)"));
        String name = pattern.match(request.getUri()).group(1);
        
        logger.info("Logging INFO with Logback");
        logger.error("Logging ERROR with Logback");
        
        return Observable.just("Hello " + name);
    }
}
