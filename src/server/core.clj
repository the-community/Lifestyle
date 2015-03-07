(ns server.core)
(defn handler [request]
  {:status 200
   :headers {"Content-Type" "text/html"}
   :body "Hello World"})
(defn -main [& args]
	(use 'ring.adapter.jetty)
	(run-jetty handler {:port 3000}))