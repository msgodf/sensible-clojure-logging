# sensible-clojure-logging

This is an example of using [clojure.tools.logging](https://github.com/clojure/tools.logging) and [unilog](https://github.com/pyr/unilog), with the added bonus of MDC (logging context) via [io.clj/logging](https://github.com/clj-io/logging).

## Why?

I wanted to have a minimal project that used these libraries to get useful (log messages with a context map) JSON logging output that I can send to Logstash.
