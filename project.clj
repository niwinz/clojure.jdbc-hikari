(defproject clojure.jdbc/clojure.jdbc-hikari "0.3.3"
  :description "Fast, simple, reliable. HikariCP is a 'zero-overhead' production ready JDBC connection pool implementation for clojure.jdbc."
  :url "http://github.com/niwibe/clojure.jdbc-hikari"
  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [hikari-cp "0.13.0" :exclusions [org.clojure/clojure]]]
  :profiles {:dev {:dependencies [[clojure.jdbc "0.4.0-beta1"]
                                  [com.h2database/h2 "1.3.176"]]}})
