(defproject material-ui-reagent "0.13.1"
  :description "Material Design UI components built with React for Reagent"
  :url "https://github.com/vincentjames501/material-ui-reagent"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :clojurescript? true
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [cljsjs/material-ui "0.13.1"]]
  :plugins []
  :profiles {:dev
             {:dependencies [[org.clojure/clojurescript "0.0-2322"]]
              :plugins [[lein-cljsbuild "1.0.3"]]}})
