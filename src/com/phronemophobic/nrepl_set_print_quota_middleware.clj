(ns com.phronemophobic.nrepl-set-print-quota-middleware
  (:require [nrepl.middleware :as middleware]
            [nrepl.middleware.print :as print]))

(defn middleware [handler]
  (fn [request]
    (handler (assoc request
                    :nrepl.middleware.print/quota 1024))))

(middleware/set-descriptor! #'middleware
                            {:expects #{#'print/wrap-print}
                             :require #{}
                             :handles {}})

