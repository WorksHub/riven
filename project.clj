(defproject workshub/riven "0.1.0-SNAPSHOT"
  :description "A tiny Clojure(Script) wrapper for the UpStamps API (upstamps.com)"
  :url "https://github.com/WorksHub/riven"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.520" :scope "provided"]
                 [cljs-ajax "0.7.5"]]
  :repositories [["releases" {:url   "https://clojars.org/repo"
                              :creds :gpg}]
                 ["snapshots" {:url   "https://clojars.org/repo"
                               :creds :gpg}]])
