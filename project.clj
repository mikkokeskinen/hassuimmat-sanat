(defproject hassuimmat-sanat "0.1.0-SNAPSHOT"
  :description "Calculate maximum hassuus from words in a file"
  :url "http://blog.kesoil.com"
  :license {:name "MIT"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot hassuimmat-sanat.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
