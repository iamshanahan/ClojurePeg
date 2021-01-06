(ns my-peg.core-test
  (:require [clojure.test :refer :all]
            [my-peg.core :refer :all]))

(deftest tri-test
  (testing "tri*"
    (is (= '(1 3 6 10 15 21) (take 6 (tri*))))
))

(deftest triangular-test
  (testing "triangular?"
    (is (not (triangular? -1)))
    (is (not (triangular? 0)))
    (is (not (triangular? 2)))
    (is (not (triangular? 22)))
    (is (triangular? 1))
    (is (triangular? 21))
))

(deftest row-tri-test
  (testing "row-tri"
    (is (= 1 (row-tri 1)))
    (is (= 3 (row-tri 2)))
    (is (= 6 (row-tri 3)))
    (is (= 10 (row-tri 4)))
))

(deftest row-num-test
  (testing "row-num"
    (is (= 1 (row-num 1)))
    (is (= 2 (row-num 2)))
    (is (= 2 (row-num 3)))
    (is (= 3 (row-num 4)))
))
