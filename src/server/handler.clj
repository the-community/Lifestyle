(ns server.handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
			[ring.util.response :refer [resource-response response]]))

(defroutes app-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (route/not-found "Not Found"))

(def app app-routes)
