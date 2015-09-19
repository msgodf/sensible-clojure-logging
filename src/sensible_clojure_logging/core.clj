(ns sensible-clojure-logging.core
  (:require [clojure.string :as str]
            [clojure.tools.logging :as log]
            [io.clj.logging :refer [with-logging-context]]
            [unilog.config :refer [start-logging!]]))

(defn -main
  [& args]
  (start-logging! {:level :info
                   :console true
                   :appenders [{:appender :file
                                :encoder :pattern
                                :pattern "%p [%d] %t - %c %m%n"
                                :file "output.log"}
                               {:appender :file
                                :encoder :json
                                :file "output-json.log"}]})
  (with-logging-context
    {:arguments (str/join ", " args)}
    (log/info "Running main")))
