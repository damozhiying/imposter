package com.gatehill.imposter.plugin;

import io.vertx.ext.web.Router;

/**
 * @author Pete Cornish {@literal <outofcoffee@gmail.com>}
 */
public interface Plugin {
    void configureRoutes(Router router);
}
