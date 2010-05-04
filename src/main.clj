(ns main
  (:gen-class))

(defn -main [& args]
  (doseq [i (range 100000000)]
    (println (str "Hello from test-init-script " (System/currentTimeMillis)))
    (println (str "System property init.script.test.prop = " (System/getProperty "init.script.test.prop")))
    (Thread/sleep 1000)))

