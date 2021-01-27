(ns riven.core
  (:require [clojure.string :as str]
            [riven.http :as http]))

(def base-url "https://services.upstamps.com/api")

(defn- ->api-url
  [{:keys [client-id project-key environment-key]} & path]
  (->> (concat [base-url client-id project-key environment-key] path)
       (str/join "/")))

(defn- wrap-success-fn
  [f]
  (fn [resp]
    (f resp)))

(defn- wrap-error-fn
  [f]
  (fn [resp]
    (f resp)))

(defn flags
  [args success-fn error-fn]
  (http/GET (->api-url args "flags")
            (wrap-success-fn success-fn)
            (wrap-error-fn error-fn))
  nil)

(defn remotes
  [args success-fn error-fn]
  (http/GET (->api-url args "remotes")
            (wrap-success-fn success-fn)
            (wrap-error-fn error-fn))
  nil)

(defn ab-tests
  [args success-fn error-fn]
  (http/GET (->api-url args "testing")
            (wrap-success-fn success-fn)
            (wrap-error-fn error-fn))
  nil)
