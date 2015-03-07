(ns server.handler
  (:require [compojure.core :refer :all]
			[compojure.handler :refer [site]]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
			[ring.util.response :refer [resource-response response]]))

(defroutes app-routes
  (GET "/" [] (resource-response "index.html" {:root "public"}))
  (POST "/happy" [happy] (prn "happy:" happy) (str "happy:" happy))
  (route/not-found "Not Found"))

(def app (site app-routes))
