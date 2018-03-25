(ns clojure-simple-http.core
  (:require [org.httpkit.server :refer [run-server]]
            ))

(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    (str "HelloWorld")})

(defn -main [& args]
  (run-server app {:port 11080})
  (println "Server started on port 11080"))

