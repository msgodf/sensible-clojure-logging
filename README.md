# sensible-clojure-logging

This is an example of using [clojure.tools.logging](https://github.com/clojure/tools.logging) and [unilog](https://github.com/pyr/unilog), with the added bonus of MDC (logging context) via [io.clj/logging](https://github.com/clj-io/logging).

## Why?

I wanted to have a minimal project that used these libraries to get useful (log messages with a context map) JSON logging output that I can send to Logstash.

## How do I run this example?

Clone the repo, go to the resulting directory, and run `lein run`.

You should see something like this in stdout

```
$ lein run
INFO [2016-10-13 10:39:09,119] main - {arguments=} - sensible-clojure-logging.core Running main
```

This output will also be written to a file `output.log`, and as JSON to `output-json.log`.
