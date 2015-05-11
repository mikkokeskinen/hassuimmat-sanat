(ns hassuimmat-sanat.core-test
  (:require [clojure.test :refer :all]
            [hassuimmat-sanat.core :refer :all]))

(deftest test-hassuus
  (testing "Test that hassuus function calculates the correct hassuus amount"
    (is (= (hassuus "koira") 10))))

(deftest test-find-max-hassuus
  (testing "Test that find-max-hassuus function returns the correct word"
    (is (= (find-max-hassuus ["joopajoo" "sana" "onomatopoeettinen" "koira"])
           {:words ["onomatopoeettinen"], :hassuus 36}))))

(deftest test-find-max-hassuus-multiple
  (testing "Test that find-max-hassuus function returns multiple correct words"
    (is (= (find-max-hassuus ["joopajoo" "sana" "onomatopoeettinen" "koira" "vaiteliaana"])
           {:words ["onomatopoeettinen" "vaiteliaana"], :hassuus 36}))))
