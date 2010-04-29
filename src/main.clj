(ns main
  (:gen-class))

(defn -main [& args]
  (doseq [i (range 100000000)]
    (println (str "Hello from test-init-script " (System/currentTimeMillis)))
    (Thread/sleep 1000)))

