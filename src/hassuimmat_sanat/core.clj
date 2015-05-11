(ns hassuimmat-sanat.core
  (:gen-class))

(defn hassuus
  "Returns Hassuus number for a word.  The number is calculated as follows:
   Every group of adjacent vowels in the word are given a score with the formula
   n*2^n where n is the number of adjacent vowels. The scores are summed together
   to form the total Hassuus."
  [word]
  (reduce + (map #(* (count %) (int (Math/pow 2 (count %)))) (re-seq #"(?i)[aeiouyåäö]+" word))))

(defn find-max-hassuus
  "Calculates Hassuus number for all words in the word-list sequence and returns
   the words with the most Hassuus together with the Hassuus number. e.g.
   {:words [\"koira\"] :hassuus 10}"
  [word-list]
  (loop [words word-list
         result {:words [] :hassuus 0}]
    (if (empty? words)
      result
      (recur (rest words)
             (let [current-word (first words)
                   current-hassuus (hassuus current-word)
                   max-hassuus (:hassuus result)]
               (cond
                 (= current-hassuus max-hassuus) {:words (conj (:words result) current-word) :hassuus current-hassuus}
                 (> current-hassuus max-hassuus) {:words [current-word] :hassuus current-hassuus}
                 :else result))))))

(defn -main
  [& args]
  (let [filename (.getPath (clojure.java.io/resource "alastalon_salissa.txt"))
        words (clojure.string/split (slurp filename) #"\s+")
        cleaned-words (set (map #(.replaceAll (clojure.string/lower-case %) "[^a-zaåäö-]" "") words))
        result (find-max-hassuus cleaned-words)]
    (if (= (count (:words result)) 1)
      (printf "Hassuin sana \"%s\" saa %s pistettä.\n" (first (:words result)) (:hassuus result))
      (printf "Hassuimmat sanat \"%s\" saa %s pistettä.\n" (clojure.string/join "\", \"" (:words result)) (:hassuus result)))))
