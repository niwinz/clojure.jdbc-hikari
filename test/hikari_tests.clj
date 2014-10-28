(ns hikari-tests
  (:require [jdbc.core :refer :all]
            [jdbc.pool.hikari :as pool]
            [clojure.test :refer :all]))

(def dbspec {:adapter :h2
             :url "jdbc:h2:/tmp/test"})

(deftest datasource-spec
  (testing "Connection pool testing."
    (let [spec (pool/make-datasource-spec dbspec)]
      (is (instance? javax.sql.DataSource (:datasource spec)))
      (with-open [conn (make-connection spec)]
        (is (instance? jdbc.types.Connection conn))
        (is (instance? java.sql.Connection (:connection conn)))
        (let [result (query conn ["SELECT 1 + 1 as foo;"])]
          (is (= [{:foo 2}] result)))))))
