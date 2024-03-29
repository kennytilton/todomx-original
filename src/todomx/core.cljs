(ns todomx.core
  (:require
    [clojure.browser.repl :as repl]
    [goog.dom :as dom]
    [tiltontec.model.core :as md]
    [tiltontec.tag.html :refer [tag-dom-create *tag-trace*]]
    [todomx.todomvc :as tmx]))

(defonce conn
   (repl/connect "http://localhost:9000/repl"))

(enable-console-print!)

(let [root (dom/getElement "tagroot")

      app-matrix (tmx/matrix-build!)
      app-dom (binding [*tag-trace* nil]
                (tag-dom-create
                  (md/md-get app-matrix :mx-dom)))]
  (assert root "DIV with id 'tagroot' not found.")
  (set! (.-innerHTML root) nil)
  (dom/appendChild root app-dom)
  (when-let [route-starter (md/md-get app-matrix :router-starter)]
    (route-starter)))
