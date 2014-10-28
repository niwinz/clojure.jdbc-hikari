(ns hikari-tests
  (:require [jdbc :refer :all]
            [jdbc.pool.hikari :as pool-hikari]
            [clojure.test :refer :all]))

(def h2-dbspec {:adapter :h2
                :url "jdbc:h2:/tmp/test"})

(deftest hikari-datasource-spec
  (testing "C3P0 connection pool testing."
    (let [spec (pool-hikari/make-datasource-spec h2-dbspec)]
      (is (instance? javax.sql.DataSource (:datasource spec)))
      (with-open [conn (make-connection spec)]
        (is (instance? jdbc.types.Connection conn))
        (is (instance? java.sql.Connection (:connection conn)))
        (let [result (query conn ["SELECT 1 + 1 as foo;"])]
          (is (= [{:foo 2}] result)))))))



