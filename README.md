# init-script-test

An example project that provides an example of how to use the leiningen-init-script plugin

## How-To
Clone the init-script-test repo

    git clone git://github.com/zkim/init-script-test.git

cd into the cloned repo directory

	cd init-script-test</code>
	
Download dependencies
	
	lein deps
	
Run the init-script task
	
	lein init-script
	
	Your output should look something like:
	
	Created /Users/zkim/tmp/init-script-test/init-script-test.jar
	Including init-script-test.jar
	Including clojure-1.1.0.jar
	Including clojure-contrib-1.1.0.jar
	Including leiningen-init-script-0.1.0.jar
	*** Done generating init scripts, see the /Users/zkim/tmp/init-script-test/init-script/ directory
	napple:init-script-test zkim$
	
cd into the init-script directory
	cd ./init-script
	
Make install-init-script-test, clean-init-script-test runnable
	chmod u+x ./install-init-script-test
	chmod u+x ./clean-init-script-test
	
Install init script and jar
	sudo ./install-init-script-test
	
leiningen-init-script installs the jar to /usr/local/<project-name> and the init script to /etc/init.d. These defaults can be changed, see the Configuration section of the [leiningen-init-script](http://github.com/zkim/leiningen-init-script) README


Start the daemon service
	sudo /etc/init.d/init-script-testd start
	
Verify the jar is running
	ps -e
	
	Output:
	
	44678 ttys003    0:00.01 login -pf zkim
	44679 ttys003    0:00.11 -bash
	45216 ttys003    0:01.28 /usr/bin/java -jar /usr/local/init-script-test/init-script-test-standalone.jar
	45225 ttys003    0:00.00 ps -e
	
Stop the daemon service and verify the process has stopped
	sudo /etc/init.d/init-script-testd stop
	
	ps -e
	
	44198 ttys002    0:00.09 -bash
	44678 ttys003    0:00.01 login -pf zkim
	44679 ttys003    0:00.11 -bash
	45248 ttys003    0:00.00 ps -e
	
## License

[Eclipse Public License v1.0](http://www.eclipse.org/legal/epl-v10.html)