(ns sensible-clojure-logging.core
  (:require [clojure.string :as str]
            [clojure.tools.logging :as log]
            [io.clj.logging :refer [with-logging-context]]
            [unilog.config :refer [start-logging!]]))

(defn -main
  [& args]
  (start-logging! {:level :info
                   :console false
                   :appenders [{:appender :file
                                :encoder :pattern
                                :pattern "%p [%d] %t - {%mdc} - %c %m%n"
                                :file "output.log"}
                               {:appender :console
                                :encoder :pattern
                                :pattern "%p [%d] %t - {%mdc} - %c %m%n"}
                               {:appender :file
                                :encoder :json
                                :file "output-json.log"}]})
  (with-logging-context
    {:arguments (str/join ", " args)}
    (log/info "Running main")))
