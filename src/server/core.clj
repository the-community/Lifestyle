(ns server.core)
(require 'ring.adapter.jetty)

(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "<b>Hello World<b>"})
   
   
(defn -main [& args]
	(ring.adapter.jetty/run-jetty handler {:port 3000}))