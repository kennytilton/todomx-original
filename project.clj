(defproject todomx "0.1.0-SNAPSHOT"
  :description "The TodoMVC Classic implemented in Tag/Matrix"
  :url "http://tiltontec.com"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.671"]
                 [com.cognitect/transit-cljs "0.8.239"]
                 [funcool/bide "1.5.0"]
                 [clj-http "3.7.0"]
                 [cljs-http "0.1.44"]
                 [cljs-ajax "0.7.2"]
                 [cheshire "5.8.0"]
                 [com.tiltontec/matrix "0.1.0-SNAPSHOT"]
                 [com.tiltontec/tag "0.1.0-SNAPSHOT"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.2"]]
  :npm {:dependencies [[source-map-support "0.4.0"]]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release"]
  :target-path "target")
