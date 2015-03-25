(defproject sweetalert "0.1.0-SNAPSHOT"
  :description "A minimal cljs-wrapper for sweetalert: https://github.com/t4t5/sweetalert"
  :url "https://github.com/vikeri/cljs-sweetalert"
  :author "vikeri"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-3126"]]

  :plugins [[lein-cljsbuild "1.0.5"]]

  :source-paths ["src"]

  :clean-targets ^{:protect false} ["example/out"]
  
  :cljsbuild {
    :builds [{:id "example"
              :source-paths ["src" "example/src"]
              :compiler {:output-to "example/out/main.js"
                         :output-dir "example/out"
                         :main example.core
                         :asset-path "out"
                         :foreign-libs [{:file "https://cdnjs.cloudflare.com/ajax/libs/sweetalert/0.5.0/sweet-alert.min.js"
                                                          :provides ["t4t5.sweetalert"]}]
                         :optimizations :none
                         :source-map true}}]}
)
