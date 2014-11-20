(defproject clojure.jdbc/clojure.jdbc-hikari "0.3.2"
  :description "Fast, simple, reliable. HikariCP is a 'zero-overhead' production ready JDBC connection pool implementation for clojure.jdbc."
  :url "http://github.com/niwibe/clojure.jdbc-hikari"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clojure.jdbc "0.3.1"]
                 [hikari-cp "0.11.1" :exclusions [com.zaxxer/HikariCP
                                                  org.clojure/clojure]]
                 [com.zaxxer/HikariCP "2.2.5"]]
  :profiles {:dev {:dependencies [[com.h2database/h2 "1.3.176"]]}})
