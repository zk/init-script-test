(defproject init-script-test "0.1.0"
  :description "Test project for leiningen-init-script"
  :dependencies [[org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]]
  :dev-dependencies [[leiningen-init-script "0.1.0"]]
  :lis-opts {:properties {:clj-config.env "dev"
			  :java.library.path "/some/dir"
			  :init.script.test.prop "test with spaces"}
	     :java-opts ["-server"
			 "-Xms256M"
			 "-Xmx512M"
			 "-XX:MaxPermSize=128M"]
	     :redirect-output-to "/var/log/init-script-test.log"}
  :main main)

