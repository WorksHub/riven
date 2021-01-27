(ns riven.http
  (:require #?(:clj [cheshire.core :as _json])
            [ajax.core :as client]))

(defn GET
  [url handler-fn error-fn]
  (client/GET url {:response-format (client/json-response-format {:keywords? true})
                   :handler         handler-fn
                   :error-handler   error-fn}))
